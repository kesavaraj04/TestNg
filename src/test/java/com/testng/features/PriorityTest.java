package com.testng.features;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 2)
	private void searchWatch() {
		System.out.println("SearchWatch");
	}
	
	@Test(priority = 4)
	private void searchLaptop() {
		System.out.println("searchlaptop");
	}
	
	@Test(priority = 5)
	private void searchMobile() {
		System.out.println("searchmobile");
	}
	
	@Test
	private void searchTv() {
		System.out.println("searchtv");
	}
	
	@Test(priority = 3)
	private void searchAirpods() {
		System.out.println("searchairpods");
	}
	
	
	
	
	
}
