package com.testng.annotations;


import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProvider1 {
	
	
	@Test(dataProvider = "login")	
	private void login(String username , String password) {
		System.out.println("User Name : "+ username);
		System.out.println("PassWord  : " + password);


	}
	@DataProvider
	private Object[][] login() {
		return new Object [][] {
			
			{"kesa","1233"},
			{"mani", "werr"},
			{"keerthy", "war"}
			
		};

	}
	

	}


