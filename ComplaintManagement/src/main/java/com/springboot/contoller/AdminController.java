package com.springboot.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/admin/admindashbords")
	public String admondashbord() {
		return"admindashbord";
	}
}
