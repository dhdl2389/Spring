package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// ������ �ż��� ������ �Ѵ�

// 1. ����
@Controller
public class TestController {

	@Autowired
	TestService service;

	@RequestMapping("/gugudan") // c
	public String test1(@RequestParam(required = false, defaultValue = "2") int dan, Model model) {
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list", danList);
		System.out.println(dan);
		return "test"; // v
	}

	@RequestMapping("/movie")
	public String test2(Model model) {
		ArrayList<String> movieList = service.getMovie();
		model.addAttribute("list", movieList);
		System.out.println(movieList);
		return "test2";

	}

}
