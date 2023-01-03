package org.selenium.rait.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class DemoTest1 {
	@Test
	public void test1() {
		Reporter.log("This is DemoTest1 test method1", true);
	}

	@Test
	public void test2() {
		Reporter.log("This is DemoTest1 test method2", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("This is DemoTest1 before method", true);

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("This is DemoTest1 after method", true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("This is DemoTest1 before suit", true);

	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("This is DemoTest1 before test", true);

	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("This is DemoTest1 before class", true);

	}

	@AfterClass
	public void AfterClass() {
		Reporter.log("This is DemoTest1 after class", true);

	}

	@AfterTest
	public void afterTest() {
		Reporter.log("This is DemoTest1 after test", true);

	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("This is DemoTest1 after suite", true);

	}

}
