package com.languageline.integration;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Sample login test, configured to always pass for
 * illustration purposes.
 */
public class Login extends BaseTest {
	@Test
	@TestData(key="QAT-T1")
	public void LoginTest() {
		System.out.println("====LoginTest====");
		System.out.println("[DEBUG] Starting the test...");
	  
		// Do relevant test stuff here.
		Assert.assertTrue(true);
	  
		System.out.println("[DEBUG] Test completed!");
	}
}
