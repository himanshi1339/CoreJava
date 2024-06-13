package co.exception;

import javax.security.auth.login.LoginException;

public class TestCustomLoginEx {
public static void main(String[] args) throws LoginException{
	String loginId=null;
	if (loginId ==null || loginId !="Himanshi") {
		throw new LoginException();
		
	}else {
		System.out.println("login successfully");
	}
}
}
