package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TestService {

	public ArrayList<String> getDan(int dan) {

		ArrayList<String> danList = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {

			danList.add(dan + "*" + i + "=" + dan * i);
		}

		return danList;
	}

	public ArrayList<String> getMovie() {

		ArrayList<String> movieList = new ArrayList<String>();
		movieList.add(new String("¹«ºù1"));
		movieList.add(new String("¹«ºù2"));
		movieList.add(new String("¹«ºù"));

		return movieList;
	}

}
