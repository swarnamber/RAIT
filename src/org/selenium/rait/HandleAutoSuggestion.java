package org.selenium.rait;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java");
		List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println("Count is --> " + sugg.size());
		for (int i = 0; i < sugg.size(); i++) {
			WebElement ele = sugg.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);

		for (WebElement e : sugg) {
			if (e.getText().equalsIgnoreCase("javascript")) {
			System.out.println("clicking Javascript option ... ");
				e.click();
				break;
			}
		}
	}

}
