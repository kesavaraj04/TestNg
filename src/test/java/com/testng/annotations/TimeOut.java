package com.testng.annotations;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test (timeOut = 4000)
	private void searchTv() throws InterruptedException {
		System.out.println("Tv");
		Thread.sleep(2000);
	}
	
	
	@Test (timeOut = 1000)
	private void searchBike() throws InterruptedException {
		System.out.println("Bike");
	//	Thread.sleep(2000);

	}

}

