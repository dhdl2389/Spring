package com.acorn.day1.di;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TestDAO {
	public ArrayList<String> selectAll() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("�ƾ�");
		list.add("��å");
		list.add("å�б�");

		return list;

	}
}
