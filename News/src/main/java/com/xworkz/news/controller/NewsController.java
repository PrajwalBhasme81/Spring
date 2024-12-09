package com.xworkz.news.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.news.dto.NewsDto;

@Component
@RequestMapping("/")
public class NewsController {

	public NewsController() {
		System.out.println("News Controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {
		NewsDto dto = new NewsDto();
		dto.setChannelName("ZEE");
		dto.setChannelNumber(023);
		dto.setChannelLanguage("Kannada");
		dto.setChannelRating(8.5f);
		model.addAttribute("Dto", dto);
		return "success.jsp";
	}
}
