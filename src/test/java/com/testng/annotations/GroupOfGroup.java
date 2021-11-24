package com.testng.annotations;

import org.testng.annotations.Test;

public class GroupOfGroup {
	
	@Test (groups = "Selenium")
	private void selenium() { 
	System.out.println("Login");

	}
	@Test (groups = "Git")
	private void git() {
		System.out.println("Push Code");

	}
	@Test  (groups = "API",timeOut = 3000,priority = 1)
	private void api() {
		System.out.println("Create Resource");

	}
	@Test (groups = "Selenium")
	private void selenium2() {
		System.out.println("Logout");
	}
	@Test (groups = "Git")
	private void git2() {
		System.out.println("Pull Code");
	}
	@Test (groups = "API")
	private void api2() {
		System.out.println("Delete Resource");

	}
	

}
