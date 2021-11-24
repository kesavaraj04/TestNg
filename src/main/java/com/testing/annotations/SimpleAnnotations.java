package com.testing.annotations;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class SimpleAnnotations {
	@Ignore ()
	private void setup() {
		System.out.println("setup");

	}
	@Test(enabled = false)
	private void launchBrowser() {
		System.out.println("browser");
	}
	@Test(groups = "hi")
	private void url() {
		System.out.println("url");
	}
	@Test (timeOut = 3000)
	private void login() {
		System.out.println("login");

	}
	@Test (priority = 3)
	private void searchTv() {
		System.out.println("Tv");

	}
	@Test(expectedExceptions = Exception.class)
	private void verifyPage() {
		int a;
		a = 10/0;
		System.out.println("verifypage");

	}
	@Test (groups =  "hi")
	private void logOut() {
		System.out.println("Logout");
		
		

	}
	@Test (priority = 2)
	private void searchLap() {
		System.out.println("lap");

	}
	@Test (groups = "bye")
	private void closeBrowser() {
		System.out.println("close");
	}
	@Test (groups =  "bye")
	private void DeleteCookies() {
		System.out.println("Delete Cookies");

	}

}
