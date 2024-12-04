package com.xworkz.di.conifguration;

import org.springframework.stereotype.Component;

@Component
public class Motorola implements Mobile {
	
	public Motorola() {
		System.out.println("Motorola");
	}

}
