package com.acorn.day1.di;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // ∞¥√º
public class TestService {

	@Autowired // Ω∫ƒµ∞‚ ¡÷¿‘
	TestDAO dao;

	public ArrayList<String> getList() {
		ArrayList<String> list = dao.selectAll();
		return list;

	}

}
