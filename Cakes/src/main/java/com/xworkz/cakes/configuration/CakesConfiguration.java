package com.xworkz.cakes.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class CakesConfiguration {

	public CakesConfiguration() {
		System.out.println("Cakes Configuration");
	}

}
