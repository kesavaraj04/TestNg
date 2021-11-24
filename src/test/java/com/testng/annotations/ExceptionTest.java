package com.testng.annotations;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	
	@Test (expectedExceptions = Exception.class)
	private void calc() {
		int a= 10/0;

	}

}
