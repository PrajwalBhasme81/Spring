package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class Chair {
	
	@Value("Wood")
	private String type;
	@Value("100 cm")
	private String height;
	@Value("40 cm")
	private String width;
	@Value("1.5 Kg")
	private String weight;
	@Value("110 Kg")
	private String weightCapacity;
	@Value("false")
	private boolean isCushion;

}
