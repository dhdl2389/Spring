package com.sh.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@Autowired
	LoginMemberService service;

	@GetMapping("/logintest1111")
	public String logintest() {
		return "jaehyuk";
	}

	@PostMapping("/myForm12")
	public String registerMember(LoginDTO loginDTO) {

		service.registerMember(loginDTO);
		return "jaehyuk";
	}
}
