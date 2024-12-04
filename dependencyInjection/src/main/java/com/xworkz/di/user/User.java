package com.xworkz.di.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.di.conifguration.Infinix;
import com.xworkz.di.conifguration.Poco;
import com.xworkz.di.conifguration.WindowsOs;

@Configuration
@ComponentScan("com.xworkz")
@Component
public class User {
	
	@Autowired
	@Qualifier("infinix")
	private Infinix infinix;
	
	@Autowired
	@Qualifier("windowsOs")
	private WindowsOs windowsOs;
	
	@Autowired
	@Qualifier("poco")
	private Poco poco;

}
