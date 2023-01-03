package org.selenium.rait;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolimorphism {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter browser? GC/FF");
			String browser = sc.next();
			WebDriver driver;
			if (browser.equalsIgnoreCase("GC")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
				driver = new FirefoxDriver();
			}
			driver.get("https://www.google.com/");
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
	}
}
