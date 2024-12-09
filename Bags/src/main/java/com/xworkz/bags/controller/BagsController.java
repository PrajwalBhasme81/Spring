package com.xworkz.bags.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BagsController {

	public BagsController() {
		System.out.println("Bags Controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("Safari");
		list.add("900");
		list.add("2.9L");
		model.addAttribute("List", list);
		return "success.jsp";
	}
}
