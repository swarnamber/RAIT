package org.selenium.rait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAxis {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///Users/swarpaul/Documents/MACBOOK%20PRO%20OLD/Imp%20Personal%20Doc/RAIT/HTML/SelectClass_xpathAxis.html");

		// Using xpath axis
		System.out.println(driver.findElement(By.xpath("//option[.=' Russia']")).getText());
		System.out.println(driver.findElement(By.xpath("//option[.=' Russia']/following-sibling::option")).getText());
		System.out.println(driver.findElement(By.xpath("//option[.=' Russia']/preceding-sibling::option")).getText());
		System.out.println(driver
				.findElement(
						By.xpath("//option[.=' Russia']/ancestor::select/following-sibling::select/child::option[2]"))
				.getText());


	}

}
