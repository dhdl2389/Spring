package com.acorn.testing2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepositoryRealImp implements AddressRepositoryI {

	@Autowired
	private SqlSession session;
	private static String namespace = "com.acorn.testing2.AddressMapper.";

	@Override
	public int insert(AddressDTO addressDTO) {

		return session.insert(namespace + "insertUser", addressDTO);
	}

}
