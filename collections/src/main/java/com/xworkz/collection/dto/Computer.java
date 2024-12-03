package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Configuration
@Data
@ComponentScan("com.xworkz")
@Component
public class Computer {
	
		@Value("Infinix")
		private String name;
		@Value("31000")
		private int price;
		@Value("16")
		private int ram;
		@Value("512")
		private int storage;
		@Value("1.5")
		private double weight;
		@Value("i3")
		private String core;
		  
	}
	


 