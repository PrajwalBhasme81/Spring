package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class Plan {
	
	@Value("Trip")
	private String type;
	@Value("8")
	private int numberOfMembers;
	@Value("15 Days")
	private String timePeriod;
	@Value("50000")
	private int budget;
	@Value("Medium")
	private String risk;
	@Value("Bike")
	private String resources;
	
}
