package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WayBackMachine {
	
static WebDriver driver;
	
	public WayBackMachine (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> resultList() {
		return driver.findElements(By.cssSelector("ul.result-list li.result-item")); 
}

	
	
	
	
	
	
	
}
	
	