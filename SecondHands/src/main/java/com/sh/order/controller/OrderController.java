package com.sh.order.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sh.login.domain.LoginDTO;
import com.sh.login.service.LoginService;
import com.sh.order.domain.OrderDTO;
import com.sh.order.service.OrderServiceI;
import com.sh.product.domain.ProductDTO;
import com.sh.product.service.ProductServiceI;

@Controller
public class OrderController {

	@Autowired
	OrderServiceI service;

	@Autowired
	ProductServiceI productservice;
	
	@Autowired
	LoginService loginService;

	@GetMapping("/order")
	public String productOrder(@RequestParam String boardId, Model model, HttpSession session) {
	    ProductDTO product = productservice.getProductById(boardId);
	    List<ProductDTO> productList = new ArrayList<>(); // 새로운 리스트를 생성합니다.

	    // 원하는 상품만 추가합니다.
	    productList.add(product);
	    model.addAttribute("product", product);
	    model.addAttribute("products", productList);

	    return "/order/order";
	}

	
	@GetMapping("/showOrder")
	public String showOrder(HttpSession session, Model model) {
		
		
		LoginDTO loggedInUser = (LoginDTO) session.getAttribute("user");
		List<OrderDTO> orderList = service.getOrdersByUserCode(loggedInUser.getUser_id());
		System.out.println(orderList);
		List<Object> code = loginService.getCheckHeatByUserCode(loggedInUser.getUser_code());
		model.addAttribute("user", loggedInUser);
		model.addAttribute("orderList", orderList);

		return "/order/showOrder";
	}

	@PostMapping("/orderForm")
	public String registerOrder(OrderDTO orderDTO) {
		service.registerOrder(orderDTO);
		return "/homePage/homePage";
	}
	

}
