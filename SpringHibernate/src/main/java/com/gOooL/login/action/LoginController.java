package com.gOooL.login.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {

	private static final String LOGIN_FORM = "login/loginForm";

	@RequestMapping(value = "login/loginForm")
	public String loginForm(Model model) {
		
		return LOGIN_FORM;
	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public String login(LoginCommand loginCommand) {
//		
//		return LOGIN_FORM;
//	}	
}
