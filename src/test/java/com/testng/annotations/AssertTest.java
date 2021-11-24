package com.testng.annotations;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	
	String actual = "Kesa";
	String expcted = "kesa"; 
	
	//Hard Assert
	
//	@Test
//	private void assertConcept() {
//		System.out.println("before");
//		Assert.assertEquals(actual, expcted);
//		System.out.println("after");
//
//	}
	
	//Soft Assert 
	@Test
	private void secondTest() {
		SoftAssert sa = new SoftAssert();
		System.out.println("before");
		sa.assertEquals(actual, expcted);
		System.out.println("After");

	}
	

}
