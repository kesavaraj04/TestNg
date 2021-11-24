package com.testing.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MixedAnnotations {
	@Test (dependsOnMethods = "camera")
	private void tv() {
		System.out.println("Tv");
	}
	@Test (dependsOnMethods = "mobile")
	private void camera() {
		System.out.println("camera");
	}
	@Test 
	private void mobile() {
		System.out.println("Mobile");
	}
	@Test (dependsOnMethods = "football")
	private void cricket() {
		System.out.println("cricket");
	}
	@Test 
	private void football() {
		System.out.println("football");
	}
	
	@Test (retryAnalyzer = Sample.class)
	private void asst() {
		System.out.println("asstA");
		
		Assert.assertEquals("A", "a");
		System.out.println("Bbbbb");
	}
	
	@Test
	private void king() {
		System.out.println("AAAA");
		SoftAssert s = new SoftAssert();
		s.assertEquals("A", "a");
		System.out.println("DDDDDDDDDDD");

	}
	

}
