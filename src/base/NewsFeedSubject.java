package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsFeedSubject {
	
static WebDriver driver;
	
	public NewsFeedSubject (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static WebElement subject() {
		return driver.findElement(By.className(".well-sm"));
	}
}
	