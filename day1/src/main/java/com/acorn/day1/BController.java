package com.acorn.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 留ㅼ꽌�뱶 �떒�쐞濡� 留ㅽ븨�쓣 �븷 �닔 �엳�떎.
@Controller
public class BController {

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		// 諛섑솚���엯 String => view �씠由� �쓽誘명븿
		return "viewName";
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public void test2() {
		// void�씪 �븣�뒗 mapping�젙蹂대�� view�씠由꾩쑝濡� �씤�떇�븿
	}

//한글 
	@GetMapping("/test3")
	public void test3() {

	}
}
