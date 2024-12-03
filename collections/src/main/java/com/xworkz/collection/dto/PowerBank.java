package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class PowerBank {
	
	@Value("MI")
	private String brand;
	@Value("15000")
	private int capacity;
	@Value("250")
	private int weight;
	@Value("3")
	private int chargingTime;
	@Value("3")
	private int numberOfOutputPorts;
	@Value("12")
	private int outputVoltage;

}
