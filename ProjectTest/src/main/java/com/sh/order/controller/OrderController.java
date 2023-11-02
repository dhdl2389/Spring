package com.sh.order.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/order")
	public String productOrder(@RequestParam String boardId, Model model) {
		ProductDTO product = productservice.getProductById(boardId);

		model.addAttribute("product", product);

		return "/order/order";
	}

	@GetMapping("/showOrder")
	public String showOrder(OrderDTO orderDTO, Model model) {
	    List<OrderDTO> orderList = service.getOrderList(orderDTO);
	    
	    model.addAttribute("orderList", orderList);
	    return "/order/showOrder";
	}

	@PostMapping("/orderForm")
	public String registerOrder(OrderDTO orderDTO) {
		service.registerOrder(orderDTO);

		return "/homePage/homePage";
	}
}
