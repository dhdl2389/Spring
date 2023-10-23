package com.sh.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginMemberServiceImp implements LoginMemberService {
	
	@Autowired
	LoginMemberRepositoryI dao;

	@Override
	public int registerMember(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		return dao.insert(loginDTO);
	}
}