package com.algaworks.festa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/error")
public class Error {
	
	@GetMapping("/error")
	public ModelAndView erro() {
		ModelAndView modelAndView = new ModelAndView("Error");
		return modelAndView;
	}
}
