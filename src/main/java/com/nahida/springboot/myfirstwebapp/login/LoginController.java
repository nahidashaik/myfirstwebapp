package com.nahida.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
 //login redirected to com.nahida.springboot.myfirstwebapp.login.LoginController =>Login.jsp
//http://localhost:8080/login?name=Nahida
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name) {
		return "login";
	}
}
