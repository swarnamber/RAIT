package org.selenium.rait.popup;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.rait.JavaScriptExecutor;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.confirm('Save data?')");

		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		js.executeScript("window.confirm('Dismiss data?')");
		msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(2000);
		alert.dismiss();

	}

}
