package com.xworkz.collection.configuration;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
public class Collection {
	
	//public Collection() {
		
//	}
	
	@Bean
	public List demo() {
		System.out.println("List");
		return new ArrayList(); 
	}
	
	@Bean
	public ArrayList demo1() {
		System.out.println("ArrayList");
		return new ArrayList();
	}
	
	@Bean
	public LinkedList demo2() {
		System.out.println("LinkedList");
		return new LinkedList();
	}
	
	@Bean
	public Queue demo3() {
		System.out.println("Queue");
		return new ArrayDeque();
	}
	
	@Bean
	public Set demo4() {
		System.out.println("Set");
		return new HashSet();
	}
	
	@Bean
	public HashSet demo5() {
		System.out.println("HashSet");
		return new LinkedHashSet();
	}
	
	@Bean
	public LinkedHashSet demo6() {
		System.out.println("LinkedHashSet");
		return new LinkedHashSet();
	}
	
	@Bean
	public SortedSet demo7() {
		System.out.println("SortedSet");
		return new TreeSet();
	}
	
	@Bean
	public TreeSet demo8() {
		System.out.println("TreeSet");
		return new TreeSet();
	}
	
	@Bean
	public Map demo9() {
		System.out.println("Map");
		return new HashMap();
	}
	
	@Bean
	public HashMap demo10() {
		System.out.println("HashMap");
		return new LinkedHashMap();
	}
	
	@Bean
	public LinkedHashMap demo11() {
		System.out.println("LinkedHashMap");
		return new LinkedHashMap();
	}
	
	
}
