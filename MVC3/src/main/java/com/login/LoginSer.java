package com.login;

import org.springframework.stereotype.Service;

@Service
public class LoginSer {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("naman") && password.equals("password");
	}

}