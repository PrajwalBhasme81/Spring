package com.xworkz.collection.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class Paper {
	
	@Value("CardSheet")
	private String type;
	@Value("250 GSM")
	private String weight;
	@Value("100")
	private int thickness;
	@Value("0.9")
	private double density;
	@Value("78")
	private int brightness;
	@Value("250")
	private int smoothness;

}
