package com.xworkz.di.conifguration;

import org.springframework.stereotype.Component;

@Component
public class WindowsOs implements Os{
	
	public WindowsOs() {
		System.out.println("WindowsOS");
	}

}
