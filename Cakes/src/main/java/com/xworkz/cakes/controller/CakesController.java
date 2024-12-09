package com.xworkz.cakes.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CakesController {

	public CakesController() {
		System.out.println("Cakes Controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {
		model.addAttribute("message", "DarkForest Cake");
		return "success.jsp";
	}
}
