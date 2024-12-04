package com.xworkz.di.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.user.User;

public class DIRunner {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
		System.out.println(context.getBeanDefinitionCount());
		String[] ref = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		
		System.out.println(context.getBean(User.class));
		
		

	}

}
