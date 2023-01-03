package org.selenium.rait.popup;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/window-parent.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement clickBtn = driver.findElement(By.xpath("//input[@value='Open Window']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(300, 500)");

		Set<String> allWH = driver.getWindowHandles();
		int count = allWH.size();
		System.out.println(count);

		for (String wh : allWH) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}

}
