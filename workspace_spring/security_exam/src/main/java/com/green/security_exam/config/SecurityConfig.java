package com.green.security_exam.config;

import com.green.security_exam.jwt.JwtConfirmFilter;
import com.green.security_exam.jwt.JwtUtil;
import com.green.security_exam.jwt.LoginFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.text.Normalizer;

@Configuration //객체 생성 + 해당 클래스에 설정 내용이 들어있음을 알려줌
@EnableWebSecurity //해당 클래스가 security 설정을 컨트롤 할 수 있도록 세팅하는 어노테이션
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)
@RequiredArgsConstructor
public class SecurityConfig {

  private final JwtUtil jwtUtil;

  /*
  * 실제 시큐리티의 인증&인가에 대한 설정 코드를 작성하는 메서드
  */
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationConfiguration authConfig) throws Exception{

    //AuthenticationManager : spring security에서 실제 로그인 검증을 진행하는 객체
    AuthenticationManager authenticationManager = authConfig.getAuthenticationManager();

    http.cors(Customizer.withDefaults()) //아래에 설정한 cors 내용을 사용하겠다.
        .csrf(csrf->csrf.disable())
        .formLogin(form-> form.disable())
        .httpBasic(basic-> basic.disable())
        .sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        //session 방식을 안쓸거라 기본 설정을 전부 disable, statelsess로 바꿔준다.

        //우리가 건드릴 부분
        //인증 및 인가에 대한 설정 부분 !!!
        .authorizeHttpRequests(auth ->
                //auth.anyRequest().permitAll() //아무나 접근 가능
                auth.requestMatchers("/test2").authenticated()
                    .requestMatchers("/test3").hasRole("ADMIN")
                    .anyRequest().permitAll()
                //controller의 test2는 인증된 사람만 가능하고 그 외에는(test1)은 아무나 접근가능
        );
    //http.csrf((csrf)->{return csrf.disable();})
    //자바의 화살표 함수는 ()->{}이다
    //생략은 동일한데 소괄호 안의 내용의 하나라면 소괄호 생략, 중괄호는 리턴과 {}를 같이 생략


    //모든 요청에서 토큰을 검증하는 JwtConfirmFilter 클래스를 SecurityFilterChain에 추가
    //JwtConfirmFilter 클래스는 LoginFilter가 진행되기 전에 실행되도록 설정 함
    http.addFilterBefore(new JwtConfirmFilter(jwtUtil), LoginFilter.class);


    //원래 로그인 요청을 받는 UsernamePasswordAuthenticationFilter 대신
    //우리가 커스터마이징한 LoginFilter 를 사용하도록 필터 교체
    http.addFilterAt(new LoginFilter(authenticationManager, jwtUtil), UsernamePasswordAuthenticationFilter.class);


    return http.build();
  }

  //CORS설정
  @Bean
  public CorsConfigurationSource corsConfigurationSource(){
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.addAllowedOrigin("htt://localhost:5173"); //리엑트에서 스프링으로 접근 허용
    config.addAllowedHeader("*"); //모든 헤더 정보 허용
    config.addAllowedMethod("*"); //react에서 get, post, delete, put 허용

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

    source.registerCorsConfiguration("/**",config);

    return source;
  }


  //비밀번호 암호화 기능을 제공하는 객체 생성 메서드
  @Bean
  public PasswordEncoder getPasswordEncoder(){
    return new BCryptPasswordEncoder();
  }
}
