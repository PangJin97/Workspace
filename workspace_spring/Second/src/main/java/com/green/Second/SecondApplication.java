package com.green.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SecondApplication.class, args);
		String[] beanNames = context.getBeanDefinitionNames();

		for(String beanName : beanNames){
			Object beanType = context.getBean(beanName);
			System.out.println("객채명: " + beanName + ", 자료형 : " + beanType);
		}
	}

}
