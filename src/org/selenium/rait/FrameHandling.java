package org.selenium.rait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///Users/swarpaul/Documents/MACBOOK%20PRO%20OLD/Imp%20Personal%20Doc/RAIT/HTML/FrameDemoA.html");

		driver.switchTo().frame(driver.findElement(By.id("f1")));
		driver.findElement(By.id("t2")).sendKeys("Hello T2");

		// driver.switchTo().defaultContent();
		// driver.switchTo().parentFrame();

		driver.findElement(By.id("t1")).sendKeys("Hello T1");

	}
}
