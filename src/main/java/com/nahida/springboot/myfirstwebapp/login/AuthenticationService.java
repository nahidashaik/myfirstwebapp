package com.nahida.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	//authenticate a user
	public boolean authenticate(String username, String password) {
		boolean isvalidUsername=username.equalsIgnoreCase("nahida");
		boolean isvalidpassword= password.equalsIgnoreCase("dummy");
		return isvalidUsername && isvalidpassword;
	}
}
