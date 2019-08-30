package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLinks {
	
	static WebDriver driver;
	
	public PageLinks (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> pageLinks() {
		return driver.findElements(By.cssSelector("ul#nav-abouts li")); 
}
}

