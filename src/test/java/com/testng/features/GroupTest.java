package com.testng.features;

import org.testng.annotations.Test;

public class GroupTest {
	
	
	@Test(groups = "Selenium")
	private void selenium1() {
		System.out.println("login");
	}
	
	@Test(groups = "Git")
	private void git1() {
		System.out.println("Push code");
	}

	@Test(groups = "API")
	private void api1() {
		System.out.println("create resource");
	}
	
	@Test(groups = "Selenium")
	private void selenium2() {
		System.out.println("logout");
	}
	
	@Test(groups = "Git")
	private void git2() {
		System.out.println("pull code");
	}


	@Test(groups = "API")
	private void api2() {
		System.out.println("delete resource");
	}
	

}

