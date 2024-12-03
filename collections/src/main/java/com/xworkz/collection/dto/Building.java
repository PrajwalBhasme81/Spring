package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class Building {
	
	@Value("300")
	private int height;
	@Value("18")
	private int numberOfFloors;
	@Value("30")
	private int foundationDepth;
	@Value("cement")
	private String bricksType;
	@Value("true")
	private boolean isLift;
	@Value("100 Years")
	private String lifeSpan;
	

}
