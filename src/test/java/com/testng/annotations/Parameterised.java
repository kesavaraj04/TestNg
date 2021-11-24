package com.testng.annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised {
	
	@Test
	@Parameters({"username", "password"})
	private void login(String username , String password) {
		System.out.println("User Name : "+ username);
		System.out.println("PassWord  : " + password);

	}
	
	

}  