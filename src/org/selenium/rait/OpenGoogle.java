package org.selenium.rait;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenGoogle {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");

		FirefoxDriver fdriver = new FirefoxDriver();
		ChromeDriver cdriver = new ChromeDriver();
		fdriver.get("https://www.google.com/");
		cdriver.get("https://www.google.com/");
		cdriver.close();
		fdriver.close();

	}
}
