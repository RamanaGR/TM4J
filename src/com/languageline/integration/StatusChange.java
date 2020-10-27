package com.languageline.integration;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Sample login test, configured to always fail for
 * illustration purposes.
 */
public class StatusChange extends BaseTest {
	@Test
	//@TestData(key = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTU2ODBlYS0xYTg5LTMyNzEtYTRhZC1lMzIwNDQ2ZmRmOGMiLCJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczpcL1wvYmx1ZXJvYm90Y21wLmF0bGFzc2lhbi5uZXQiLCJ1c2VyIjp7ImFjY291bnRJZCI6IjVkMmU0NzkwNzlkNGVlMGM4YjFkMjgzOCJ9fSwiaXNzIjoiY29tLmthbm9haC50ZXN0LW1hbmFnZXIiLCJleHAiOjE2MzUwMjk0NTQsImlhdCI6MTYwMzQ5MzQ1NH0.07IiMKIcjeFldfmqPqETXOb1T0_TYOxiJnCy0dnl1ug")
	@TestData(key="QAT-T2")
	public void StatusChangeTest() {
		System.out.println("====StatusChangeTest====");
		System.out.println("[DEBUG] Starting the test...");
	  
		// Do relevant test stuff here.
		Assert.assertTrue(false);
	  
		System.out.println("[DEBUG] Test completed!");
	}
}
