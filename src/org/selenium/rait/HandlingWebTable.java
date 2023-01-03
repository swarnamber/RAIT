package org.selenium.rait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/swarpaul/Documents/MACBOOK%20PRO%20OLD/Imp%20Personal%20Doc/RAIT/HTML/WebTable.html");
		// findElement of WebDriver
		WebElement table = driver.findElement(By.id("t1"));
		// findelements of WebElement
		List<WebElement> allTD = table.findElements(By.tagName("td"));

		for (WebElement element : allTD) {
			String text = element.getText();
			System.out.println(text);

		}
		driver.quit();

	}

}
