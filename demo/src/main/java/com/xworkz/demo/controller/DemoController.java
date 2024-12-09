package com.xworkz.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DemoController {

	public DemoController() {
		System.out.println("Demo Controller");
	}
	
	@GetMapping("/submit")
	public String getResponse(Model model)
	{
		System.out.println("Response");
		model.addAttribute("message","Hello we done the Connection");
		return "success.jsp";
	}
	
	@PostMapping("/post")
	public String getPost()
	{
		System.out.println("Post");
		return "success.jsp";
	}
	
	@GetMapping("/delete")
	public String getDelete()
	{
		System.out.println("Delete");
		return "success.jsp";
	}
	
	@PostMapping("/put")
	public String getPut()
	{
		System.out.println("Put");
		return "success.jsp";
	}

}
