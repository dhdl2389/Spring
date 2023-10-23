package com.acorn.testing;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class logintest {

	@Autowired
	KakaoMemberServiceI service;

	@Autowired
	HttpSession httpSession;

	@GetMapping("/logintest")
	public String logintest() {
		return "logintest";
	}

	@PostMapping("/myForm")
	public String registerMember(KakaoUserDTO kakaoUserDTO) {
		httpSession.setAttribute("user", kakaoUserDTO);
		service.registerMember(kakaoUserDTO);
		return "logintest";
	}
	

}
