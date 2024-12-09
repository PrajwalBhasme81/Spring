package com.xworkz.color.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ColorConfiguration {

	public ColorConfiguration() {
		System.out.println("Color Configuration");
	}

}
