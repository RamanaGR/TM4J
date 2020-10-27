package com.languageline.integration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.testng.annotations.Listeners;

import com.languageline.listeners.ConnectorListener;
import com.languageline.listeners.IntegrationListener;

@Listeners({ ConnectorListener.class, IntegrationListener.class })
public class BaseTest {
	/*
	 * Define the custom TestData tag for storing the
	 * TM4J test key for all inherited tests.
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.METHOD })
	public @interface TestData {
		String key() default "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTU2ODBlYS0xYTg5LTMyNzEtYTRhZC1lMzIwNDQ2ZmRmOGMiLCJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczpcL1wvYmx1ZXJvYm90Y21wLmF0bGFzc2lhbi5uZXQiLCJ1c2VyIjp7ImFjY291bnRJZCI6IjVkMmU0NzkwNzlkNGVlMGM4YjFkMjgzOCJ9fSwiaXNzIjoiY29tLmthbm9haC50ZXN0LW1hbmFnZXIiLCJleHAiOjE2MzUwMjk0NTQsImlhdCI6MTYwMzQ5MzQ1NH0.07IiMKIcjeFldfmqPqETXOb1T0_TYOxiJnCy0dnl1ug";
	}
}
