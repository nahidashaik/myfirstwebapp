package com.nahida.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	// "say hello" => "Hello what are you learning today?"
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello what are you learning today?";
	}
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title>");
		buffer.append("My First HTML Page -changed");
		buffer.append("</title>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("My First HTML Page with body - changed.");		
		buffer.append("</body>");	
		buffer.append("<html>");
		return buffer.toString();
	}
	//say hello jsp => sayHello.jsp
	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	///src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	//src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	///src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
