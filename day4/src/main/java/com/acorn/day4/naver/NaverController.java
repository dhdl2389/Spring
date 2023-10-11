package com.acorn.day4.naver;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import oracle.ucp.common.FailoverStats.Item;

@Controller
public class NaverController {

	@Autowired
	ApiExamSearchBlog2 api;

	@Autowired
	ApiExamSearchBlog2 api2;

	@ResponseBody
	@GetMapping(value = "/naver", produces = "application/json;charset=UTF-8")
	public String naverApi() {
		String result = api.getNaverAPI();
		return result;
	}

	@ResponseBody
	@GetMapping(value = "/naverList")
	public ArrayList<ItemDTO> naverAPI2() {
		String result = api2.getNaverAPI();
		ArrayList<ItemDTO> list = api2.fromJSONItems(result);
		return list;
	}

	
	@RequestMapping(value = "/naverShopping2", method = RequestMethod.GET)
	public  void  SearchAll2(Model model) throws SQLException {
		
		
	}
	@RequestMapping("/naverShopping")
	public String SearchAll(Model model) throws SQLException {
		String result = api2.getNaverAPI();
		ArrayList<ItemDTO> list = api2.fromJSONItems(result);
		model.addAttribute("list", list);
		return "naverShopping";
	}

}
