package com.testing.annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
	@Test
	@Parameters({"name","password"})
	private void login(String name, String password) {
		System.out.println("enter ur login Details");
		System.out.println("ur name : " + name);
		System.out.println("Password : " + password);
		

	}

}
