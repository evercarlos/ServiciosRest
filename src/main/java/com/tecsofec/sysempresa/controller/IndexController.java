package com.tecsofec.sysempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String getIndex() {
		return "redirect:swagger-ui.html";
	}
}
