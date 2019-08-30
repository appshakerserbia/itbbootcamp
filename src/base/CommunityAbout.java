package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommunityAbout {
	
static WebDriver driver;
	
	public CommunityAbout (WebDriver driver) {
	    this.driver = driver;
}
	private static List<WebElement> contributorList() {
		return driver.findElements(By.cssSelector("div.about-box > div.items_list.person")); 
		}
	
	private static List<WebElement> graphList() {
		return driver.findElements(By.cssSelector("div.grafs.about-box")); 
		}
	
	private static List<WebElement> relatedCollectionList() {
		return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-7 > div > ul > li > a")); 
		}
	
	private static List<WebElement> topRegionsList() {
		return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-5 > section > table > tbody > tr")); 
		}
}
