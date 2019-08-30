package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsFeedPage {
	
static WebDriver driver;
	
	public NewsFeedPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> newsFeedList() {
		return driver.findElements(By.cssSelector("tr.forumRow")); 
}
	
	private static WebElement newsMailBtn() {
		return driver.findElement(By.cssSelector(".box > h1:nth-child(1) > a:nth-child(1)"));
	}

}
