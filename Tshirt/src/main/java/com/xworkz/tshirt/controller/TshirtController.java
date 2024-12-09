package com.xworkz.tshirt.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TshirtController {

	public TshirtController() {
		System.out.println("Cakes Controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {
		Set<String> set = new HashSet<String>();
		set.add("Puma");
		set.add("Nike");
		set.add("Calvin Klein");
		set.add("US Polo");
		set.add("Levi's");
		model.addAttribute("Set", set);
		return "success.jsp";
	}
}
