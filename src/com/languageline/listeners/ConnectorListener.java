package com.languageline.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.languageline.utilities.Connector;
import org.testng.ITestResult;

public class ConnectorListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	/*
	 * Create a connector for use by the shared TestNG context.
	 */
	@Override
	public void onStart(ITestContext context) {
		Connector connector = new Connector();
		context.setAttribute("connector", connector);
		
		System.out.println("[DEBUG] Connector assigned & configured!");
	}

	@Override
	public void onFinish(ITestContext context) {

	}
}
