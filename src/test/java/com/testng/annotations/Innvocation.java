package com.testng.annotations;

import org.testng.annotations.Test;

public class Innvocation {
	@Test (invocationCount = 2)
	private void tv() {
		System.out.println("Tv");

	}
	@Test
	private void mobile() {
		System.out.println("Mobile");

	}
	@Test (invocationCount = 3)
	private void car() {
		System.out.println("car");

	}
}
