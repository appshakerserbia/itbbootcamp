package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class HelpPage {
    
    static WebDriver driver;
    
    //Elements
	
	public HelpPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static WebElement helpSearchBar() {
		return driver.findElement(By.cssSelector("id#query"));
	}
	
	private static List<WebElement> helpBtnList() {
		return driver.findElements(By.cssSelector("ul.blocks-list li")); 
}
	
	private static WebElement helpSignIn() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	//Actions
	
	public void clickOnHelp(int i) { //clicks on one of the links
		helpBtnList().get(i).click();
	}
	public void clickSignInLink() {
		helpSignIn().click();
	}
	public void helpSearch(String search) { 
		helpSearchBar().sendKeys(search);
	}
	public void clickOnSearch() {
        helpSearchBar().sendKeys(Keys.ENTER); 
	}
	
	

}
