package com.acorn.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@GetMapping("/Ex01")
	public String Ex01() {
		return "Ex01";
	}

	@ResponseBody
	@GetMapping("/Ex02")
	public ArrayList<Fighting> Ex02() {

		ArrayList<Fighting> list = new ArrayList<Fighting>();
		list.add(new Fighting("1번 메시지"));
		list.add(new Fighting("2번 메시지"));
		list.add(new Fighting("3번 메시지"));
		return list;
	}

	@GetMapping("/Ex03")
	public String Ex03(Model model) {
		Book book = new Book("testname", "9999", "홍길동");
		model.addAttribute("book", book);
		return "Ex03";
	}

	@ResponseBody
	@GetMapping("/Ex04")
	public ArrayList<Book> Ex04() {
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("책제목1", "9999", "홍길동"));
		list.add(new Book("책제목2", "8888", "나길동"));
		list.add(new Book("책제목3", "7777", "벅길동"));

		return list;
	}

	@GetMapping("/Ex05")
	public void Ex05(HttpServletResponse response) {

		try {
			response.setContentType("text/plain;charset=utf-8");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().println("데이터간다");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@ResponseBody
	@GetMapping(value = "/Ex06", produces = "application/json;charset=utf-8")
	public ArrayList<User> Ex06() {
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("test01", "0000"));
		list.add(new User("test02", "1111"));
		list.add(new User("test03", "2222"));
		return list;
	}

}
