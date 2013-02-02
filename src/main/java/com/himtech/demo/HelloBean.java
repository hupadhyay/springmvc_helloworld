package com.himtech.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBean
{
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/welcome")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 Hello World Application");
		return "hello";
	}
}
