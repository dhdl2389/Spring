package com.sh.homePage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homePageController {

	@GetMapping("/homePage")
	public String homePage() {

		// return "/homePage/homePage";

		return "/homePage/homePage";
	}

	

}
