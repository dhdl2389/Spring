package com.acorn.day1.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttributeEx {
	
	//Model 媛앹껜�뿉 �옄�룞�쑝濡� ���옣�빐 以�  key�뒗 User 泥� 湲��옄 �냼臾몄옄�삎�깭濡� �궎媛� �젙�빐吏� 
	//Model媛앹껜�뿉 �떞�� �뜲�씠�꽣�뒗 �솕硫�(view)�뿉�꽌 爰쇰궪 �닔 �엳�떎
	@RequestMapping("/mAttribute")
	public String  test1(@ModelAttribute  User user) {    //@ModelAttribute   �깮�왂媛��뒫�븿  , model 媛앹껜�뿉 �옄�룞�쑝濡� �떞�븘以� 
		return "mview1";
	}
	
	
	@RequestMapping("/mAttribute2")
	public String  test2( User user) {    //@ModelAttribute   �깮�왂媛��뒫�븿  , model 媛앹껜�뿉 �옄�룞�쑝濡� �떞�븘以� 
		return "mview2";
	}	 
 
	@RequestMapping("/mAttribute3")
	public String  test3(@ModelAttribute("nUser") User user) {    
		return "mview3";                              
	}
	 
	 
	
}
