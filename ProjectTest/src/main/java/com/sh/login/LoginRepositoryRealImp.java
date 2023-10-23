package com.sh.login;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryRealImp implements LoginMemberRepositoryI {

	@Autowired
	private SqlSession session;
	private static String namespace = "com.sh.login.loginUserMapper.";

	@Override
	public int insert(LoginDTO loginDTO) {

		return session.insert(namespace + "insertUser", loginDTO);
	}
}
