package com.xworkz.di.conifguration;

import org.springframework.stereotype.Component;

@Component
public class Dell implements Laptop{
	
	public Dell() {
		System.out.println("Dell");
	}

}
