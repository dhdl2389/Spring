package com.acorn.day2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.day2.api.Drama;

@Controller
public class CarrotController {

	@Autowired
	CarrotDAO dao;

	@RequestMapping("/select")
	public String SearchAll(Model model) throws SQLException {
		ArrayList<CarrotDTO> carrotList = dao.selectAll();
		model.addAttribute("carrotList", carrotList);
		return "carrot";
	}

	@ResponseBody
	@RequestMapping(value = "/carrot/select/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id, Model model) throws SQLException {

		dao.deleteCarrot(id);
		return "carrot";
	}
	
	@ResponseBody
	@PutMapping("/carrot/updatecarrot")
	public String updateCarrot(@RequestBody CarrotDTO dto) throws SQLException {
		dao.updateCarrot(dto.getId(), dto.getPrice(), dto.getInfo());
		return "carrot";
	}

	@GetMapping("/register-form")
	public String showRegisterForm(Model model) {
		model.addAttribute("carrot", new CarrotDTO());
		return "register-form";
	}

	@RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST })
	public String processRegistration(CarrotDTO carrot, Model model) {
		try {
			boolean success = dao.RegisterCarrot(carrot.getId(), carrot.getPrice(), carrot.getInfo(),
					carrot.getNewTime());

			model.addAttribute("carrotList", dao.selectAll());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "register-form";
	}
}
