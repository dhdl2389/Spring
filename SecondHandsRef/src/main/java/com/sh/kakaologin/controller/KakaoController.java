package com.sh.kakaologin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sh.kakaologin.service.KakaoMemberServiceI;
import com.sh.saveUser.domain.UserDTO;
import com.sh.saveUser.service.UserMemberService;

@Controller
public class KakaoController {

	@Autowired
	KakaoMemberServiceI service;

	@Autowired
	UserMemberService service1;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/login")
	public String logintest() {
		// 유저 로그인
		return "/login/login";
	}

	@PostMapping("/kakaoForm")
	public String sendData(@RequestParam String user_kakao, @RequestParam String nickname,
			@RequestParam String profile_image, Model model) {
		// 카카오 api호출
		model.addAttribute("user_kakao", user_kakao);
		model.addAttribute("nickname", nickname);
		model.addAttribute("profile_image", profile_image);
		return "/saveUser/saveUser";
	}

	@PostMapping("/saveForm") 	
	public String registerMember(UserDTO userDTO) {

		String plainPassword = userDTO.getUser_pw(); // 기존 userDTO에서 비밀번호 추출
		String hashedPassword = passwordEncoder.encode(plainPassword);
		userDTO.setUser_pw(hashedPassword); // 해시된 비밀번호를 다시 userDTO에 설정

		// 로그 추가
		System.out.println("Plain Password: " + plainPassword);
		System.out.println("Hashed Password: " + hashedPassword);

		// 회원가입 서비스 호출
		service1.registerMember(userDTO);
		System.out.println("확인용");

		// 로그인 페이지로 이동
		return "/login/login";

	}
}
