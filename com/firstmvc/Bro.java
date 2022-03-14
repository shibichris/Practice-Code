package com.firstmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Bro {
	@ResponseBody
	@RequestMapping("/sugar")
public String getSugar() {
	return "Take it....... Sugar";
}
}
