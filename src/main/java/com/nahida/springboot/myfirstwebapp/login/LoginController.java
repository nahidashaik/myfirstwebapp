package com.nahida.springboot.myfirstwebapp.login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
 //login redirected to com.nahida.springboot.myfirstwebapp.login.LoginController =>Login.jsp
//http://localhost:8080/login?name=Nahida
	private Logger logger=LoggerFactory.getLogger(getClass());
	//Model
	@RequestMapping("/login")
	public String gotoLoginPage() {
		return "login";
	} 
}
