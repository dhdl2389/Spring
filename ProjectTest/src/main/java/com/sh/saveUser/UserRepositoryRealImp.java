package com.sh.saveUser;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sh.login.LoginDTO;

@Repository
public class UserRepositoryRealImp implements UserMemberRepositoryI {

	@Autowired
	private SqlSession session;
	private static String namespace = "com.sh.saveUser.SaveUserMapper.";

	@Override
	public int insert(UserDTO userDTO) {

		return session.insert(namespace + "insertUser", userDTO);
	}
	
	@Override
	public boolean getUserById(String user_id) {

	    UserDTO user = session.selectOne(namespace + "getUserById", user_id);

	    return user != null;
	}
	
}
