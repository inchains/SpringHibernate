package com.gOooL.main.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main")
	public String list(Model model) throws RuntimeException {
		
		return "main/main";
	}
}
