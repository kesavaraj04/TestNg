package com.testng.annotations;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IngoreTest {
	
	@Ignore
	@Test
	private void searchLaptop() {
		System.out.println("laptop");

	}
	@Test
	private void searchMobile() {
		System.out.println("Mobile");

	}
	@Test () 
	private void searchTv() {
		System.out.println("Tv");

	}

}
