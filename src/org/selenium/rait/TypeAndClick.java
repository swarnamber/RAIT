package org.selenium.rait;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeAndClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get(
				"file:///Users/swarpaul/Documents/MACBOOK%20PRO%20OLD/Imp%20Personal%20Doc/RAIT/HTML/DemoInput_locatorEg.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("RAIT1");
		driver.findElement(By.id("pwd")).sendKeys("RAIT123");
		Thread.sleep(3000);
		driver.findElement(By.className("login")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RAIT2");
		Thread.sleep(3000);
		driver.findElement(By.name("sub")).click();

	}

}
