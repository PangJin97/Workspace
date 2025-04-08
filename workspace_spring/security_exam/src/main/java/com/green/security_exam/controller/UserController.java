package com.green.security_exam.controller;

import com.green.security_exam.dto.MemberDTO;
import com.green.security_exam.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  //SecurityConfig에서 만든 비밀번호 암호화 의존성 주입
  private final PasswordEncoder passwordEncoder;

  //회원가입
  @PostMapping("/join")
  public ResponseEntity<?> join(@RequestBody MemberDTO memberDTO){

    //비밀번호 암호화
    String encoded_pw = passwordEncoder.encode(memberDTO.getMemPw());

    memberDTO.setMemPw(encoded_pw);
    userService.join(memberDTO);

    log.info("회원가입 기능 실행");


    return ResponseEntity.status(HttpStatus.OK).build();
  }

  //비밀번호 암호화 연습 메서드
  @GetMapping("/test")
  public void testEncode(){
    String str1 = "java";
    String str2 = "java";

    //암호화
   String encoded_str1 = passwordEncoder.encode(str1);
   String encoded_str2 = passwordEncoder.encode(str2);

    System.out.println("암호화된 str1 = " + encoded_str1);
    System.out.println("암호화된 str2 = " + encoded_str2);

    //복호화(암호해독)는 불가능 하지만 암호화 전 비밀번호 원본을 알 수 있게는 가능
    //찾을 수 없어서 요즘 비밀번호 찾기는 초기화로 만든다

    //matches(원본 문자열, 암호화된 문자열) => true, false
    boolean result1 = passwordEncoder.matches("java", encoded_str1);
    boolean result2 = passwordEncoder.matches("python", encoded_str2);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
  }

}
