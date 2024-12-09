package com.xworkz.color.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ColorController {

	public ColorController() {
		System.out.println("Color Controller");
	}
	@GetMapping("/submit")
	public String getResponse(Model model) {
		Map<Integer, String>list = new TreeMap<>();
		list.put(1, "RED");
		model.addAttribute("Map", list);
		return "success.jsp";
	}
}
