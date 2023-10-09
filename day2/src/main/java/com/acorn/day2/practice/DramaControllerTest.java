package com.acorn.day2.practice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DramaControllerTest {

	@Autowired
	DAO dao;

	@RequestMapping("/dramatest")
	public String test2(Model model) {

		ArrayList<String> list = dao.dList();
		model.addAttribute("list", list);
		return "drama";
	}
}
