package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	
static WebDriver driver;
	
	public ContactPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	//Elements
	
	private static List<WebElement> contactMapList() {
		return driver.findElements(By.cssSelector(".container-ia > a > img")); 
}
	
	//Actions
	
	public void clickOnMap(int i) { 
		contactMapList().get(i).click();
	}
	
	
	
}
