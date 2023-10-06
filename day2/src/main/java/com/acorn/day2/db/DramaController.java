package com.acorn.day2.db;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DramaController {

	@Autowired
	DramaDAO dao;

	@RequestMapping("/drama")
	public String test1(Model model) {

		ArrayList<String> list = dao.dlist();
		model.addAttribute("list", list);

		return "drama";
	}
}
