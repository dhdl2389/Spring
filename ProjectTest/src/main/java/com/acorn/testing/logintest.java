package com.acorn.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logintest {

	@Autowired
	KakaoMemberServiceI service;

	@GetMapping("/logintest")
	public String logintest() {
		return "logintest";
	}

	 @PostMapping("/myForm")
	    public String sendData(@RequestParam String user_kakao, @RequestParam String nickname, @RequestParam String profile_image, Model model) {
	        model.addAttribute("user_kakao", user_kakao);
	        model.addAttribute("nickname", nickname);
	        model.addAttribute("profile_image", profile_image);
	        return "saveUser"; 
	    }

}
