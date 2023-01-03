package org.selenium.rait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('hello world');");

		Actions actions = new Actions(driver);
		WebElement e = null;
		actions.contextClick(e).build();
	}

}
