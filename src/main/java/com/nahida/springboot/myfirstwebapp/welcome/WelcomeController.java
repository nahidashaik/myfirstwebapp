package com.nahida.springboot.myfirstwebapp.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("welcome")
	public String gotoWelcome() {
		return "Welcome";
	}
}
