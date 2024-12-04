package com.xworkz.di.conifguration;

import org.springframework.stereotype.Component;

@Component
public class MacOs implements Os{
	
	public MacOs() {
		System.out.println("MacOS");
	}

}
