package com.testng.annotations;

public class FaceBook extends Base_Class {
	public static void main(String[] args) {
		getBrowser("chrome");
		geturl("https://www.facebook.com/");

		
		LoginPage lp = new LoginPage(driver);
		sendKeys(lp.getUserName(), "Kesavaraj");
		sendKeys(lp.getPassWord(), "85090900");
		click(lp.getLogin());
		
	}

}
