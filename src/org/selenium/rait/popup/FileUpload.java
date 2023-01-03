package org.selenium.rait.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// Try yourself
public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.2shared.com/");
		driver.findElement(By.id("upField")).sendKeys("/Users/swarpaul/Documents/MACBOOK PRO OLD/Imp Personal Doc/RAIT/UploadFiles/Book1.xlsx");
	}

}
