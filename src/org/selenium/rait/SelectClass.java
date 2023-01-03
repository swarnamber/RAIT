package org.selenium.rait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///Users/swarpaul/Documents/MACBOOK%20PRO%20OLD/Imp%20Personal%20Doc/RAIT/HTML/SelectClass_xpathAxis.html");

//		Using Select Class

		WebElement mtr = driver.findElement(By.id("mtr"));
		Select select = new Select(mtr);
		System.out.println("isMultiple? -->  " + select.isMultiple());
		System.out.println("select India...  ");
		select.selectByIndex(0);
		System.out.println("select USA...  ");
		select.selectByValue("b");
		System.out.println("select UAE...  ");
		select.selectByVisibleText("UAE");

		Thread.sleep(3000);

		System.out.println("Deselect UAE... ");
		select.deselectByVisibleText("UAE");

		List<WebElement> so = select.getAllSelectedOptions();
		System.out.println("Get All Selected Options -->");
		for (WebElement e : so)
			System.out.print(e.getText() + ", ");

		List<WebElement> o = select.getOptions();
		System.out.println("\nGet All Options -->");

		for (WebElement e : o)
			System.out.print(e.getText() + ", ");
	}

}
