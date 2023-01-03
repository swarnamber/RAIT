package org.selenium.rait.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");

		FirefoxProfile profile = new FirefoxProfile();
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		// if file is .zip never display popup download it directly
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/zip";
		profile.setPreference(key, value);

		/*
		 * http://kb.mozillazine.org/About:config_entries
		 * profile.setPreference("browser.download.folderList", 0); 0: the desktop 1
		 * (default): the downloads folder 2: the last folder specified for a download
		 * profile.setPreference("browser.download.dir", directory);
		 */

		// open firefox with above setting
		WebDriver driver = new FirefoxDriver(option);

		driver.get("https://www.selenium.dev/downloads/");
		String xp = "//a[text()='4.7.2']";
		driver.findElement(By.xpath(xp)).click();
	}

}
