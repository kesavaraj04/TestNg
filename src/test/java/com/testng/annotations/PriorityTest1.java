package com.testng.annotations;

import org.testng.annotations.Test;

public class PriorityTest1 {
	@Test (priority = 2)
	private void searchTv() {
		System.out.println("Tv");

	}
	@Test(priority = 1)
	private void searchMobile() {
		System.out.println("Mobile");
	}
	@Test(priority = 3)
	private void searchLap() {
		System.out.println("Lap");

	}
	
	@Test 
	private void searchCar() {
		System.out.println("Car");

	}
	@Test
	private void searchBike() {
		System.out.println("Bike");
	}
	@Test
	private void auto() {
		System.out.println("auto");
	}

}































