package com.sh.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	UserMemberService service;

	@GetMapping("/logintest1111")
	public String logintest() {
		return "saveUser";
	}
	
	@PostMapping("/myForm12")
	public String registerMember(UserDTO userDTO) {
		service.registerMember(userDTO);
		return "saveUser";
	}
	
	
}
