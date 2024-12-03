package com.xworkz.collection.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.collection.configuration.Collection;
import com.xworkz.collection.dto.Building;
import com.xworkz.collection.dto.Chair;
import com.xworkz.collection.dto.Computer;
import com.xworkz.collection.dto.Cups;
import com.xworkz.collection.dto.Paper;
import com.xworkz.collection.dto.Plan;
import com.xworkz.collection.dto.PowerBank;
import com.xworkz.collection.dto.Road;


public class CollectionRunner {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Collection.class);
		System.out.println(context.getBeanDefinitionCount());
		String ref[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		
		Object res1 = context.getBean("demo");
		System.out.println(res1);
		
		System.out.println("-------------Properties-----------");
		
		Object computer = context.getBean(Computer.class);
		System.out.println(computer);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object road = context.getBean(Road.class);
		System.out.println(road);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object paper = context.getBean(Paper.class);
		System.out.println(paper);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object plan = context.getBean(Plan.class);
		System.out.println(plan);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object building = context.getBean(Building.class);
		System.out.println(building);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object chair = context.getBean(Chair.class);
		System.out.println(chair);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object cup = context.getBean(Cups.class);
		System.out.println(cup);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Object powerbank = context.getBean(PowerBank.class);
		System.out.println(powerbank);
	}

}
