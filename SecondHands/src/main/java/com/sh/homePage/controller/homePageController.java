package com.sh.homePage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homePageController {

	@GetMapping("/homePage")
	public String homePage() {

		// return "/homePage/homePage";

		return "/homePage/homePage";
	}

	@PostMapping("/location-form")
	public String location(HttpSession session) {

		return "/homePage/homePage";
	}
	
	@RequestMapping("/count")
	public String count(HttpSession session, Model model) {        
	    Integer userCount = (Integer) session.getServletContext().getAttribute("userCount");
	    model.addAttribute("userCount", userCount);
	    return "/homePage/homePage";
	}
	
}
