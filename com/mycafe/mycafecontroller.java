package com.mycafe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycafecontroller {
	@RequestMapping("/cafe")
public String showWelcomePage(Model model) {
		String name="Shibin";
		model.addAttribute("MyName",name);
	return "NewFile";
}
}
