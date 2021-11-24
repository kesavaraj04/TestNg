package com.testng.features;

import org.testng.annotations.Test;

public class InnvocationTest {
	
	@Test(invocationCount = 3)
	private void searchWatch() {
		System.out.println("SearchWatch");
	}
	
	@Test(invocationCount = 5)
	private void searchLaptop() {
		System.out.println("searchlaptop");
	}
	
	@Test(invocationCount = 2)
	private void searchMobile() {
		System.out.println("searchmobile");
	}
	

}
