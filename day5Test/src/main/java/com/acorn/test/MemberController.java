package com.acorn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("/insert")
	public void insert() {
		dao.insert(new Member("test10","11","test","test"));
	}
	
	@RequestMapping("/selecting")
	public void select() {
		dao.select();
	}
	

}
