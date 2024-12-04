package com.xworkz.di.conifguration;

import org.springframework.stereotype.Component;

@Component
public class LinuxOs implements Os{
	
	public LinuxOs() {
		System.out.println("LinuxOS");
	}

}
