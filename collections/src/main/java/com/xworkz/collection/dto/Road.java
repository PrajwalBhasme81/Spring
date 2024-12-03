package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class Road {
	
	@Value("NH13")
	private String highwayName;
	@Value("2000000")
	private int distance;
	@Value("Dambar")
	private String roadType;
	@Value("One Way")
	private String direction;
	@Value("true")
	private boolean isTollGate;
	@Value("80")
	private int vehicleSpeed;
	

}
