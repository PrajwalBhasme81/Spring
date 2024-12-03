package com.workz.spring.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring4Runner {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println(context.getBeanDefinitionCount());
		String ref[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

	}

}
