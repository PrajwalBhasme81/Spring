package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class Cups {

	@Value("Steel")
	private String type;
	@Value("80ml")
	private String capacity;
	@Value("200")
	private int weigth;
	@Value("High")
	private String durability;
	@Value("70")
	private int diameter;
	@Value("Smooth")
	private String surfaceFinish;
}
