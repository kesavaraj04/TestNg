package com.testing.annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	
	@Test()
	@Parameters("username")
	private void loginPage(String username, String password) {
		System.out.println("user Name : "+ username);
		System.out.println("PassWord  : "+ password);

	}

}
