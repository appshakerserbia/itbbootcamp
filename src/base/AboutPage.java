package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {
	
static WebDriver driver;
	
	public AboutPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	//Elements
	
	private static List<WebElement> listOfNews() {
		return driver.findElements(By.cssSelector("tr.forumRow")); 
}
	private static WebElement moreNews() {
		return driver.findElement(By.cssSelector("div.box > h1 > a")); 
	}
	
	//Actions
	
	public int getNumberOfNews() {
		return listOfNews().size();
	}
	
	public void moreNewsClick() {
		moreNews().click();
	}

}
