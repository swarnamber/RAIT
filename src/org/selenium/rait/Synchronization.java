package org.selenium.rait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.kenst.com/including-the-chromedriver-location-in-macos-system-path/");

		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
