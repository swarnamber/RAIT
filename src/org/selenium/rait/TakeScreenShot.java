package org.selenium.rait;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcfile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File(
				"/Users/swarpaul/Documents/MACBOOK PRO OLD/Imp Personal Doc/RAIT/SeleniumProject/RAIT/src/org/selenium/rait/scr1.png");
		FileHandler.copy(srcfile, destfile);

	}

}
