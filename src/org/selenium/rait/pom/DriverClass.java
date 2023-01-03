package org.selenium.rait.pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/rait/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage l = new LoginPage(driver);
		l.login("abc", "xyz");
		Thread.sleep(3000);
		l.login("spaul9121@gmail.com", "manager123");

		Thread.sleep(3000);
		driver.close();
	}
}
