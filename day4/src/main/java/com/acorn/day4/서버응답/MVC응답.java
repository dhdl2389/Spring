package com.acorn.day4.서버응답;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// view + data

@Controller
public class MVC응답 {

	@RequestMapping("/mvc1")
	public String MVC1(Model model) {
		model.addAttribute("message1", "mvc1");
		return "뷰이름";
	}

	@RequestMapping("/mvc2") // mvc2 view로 인식
	public void mvc2(Model model) {
		model.addAttribute("message2", "mvc2");
	}

	@RequestMapping("/mvc3")
	public ModelAndView mvc3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("뷰이름2");
		mv.addObject("message3", "mvc3");
		return mv;
	}
}
