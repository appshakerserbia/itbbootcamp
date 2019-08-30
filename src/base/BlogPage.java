package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {
	
static WebDriver driver;
	
	public BlogPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	//Elements
	
	private static List<WebElement> blogNavigationMenu() {
		return driver.findElements(By.cssSelector("ul#menu-menu li")); 
}
	
	private static List<WebElement> facebookTwitterList() {
		return driver.findElements(By.cssSelector(".archive-sharing-widget a")); 
	}
		
	private static WebElement facebook() {
		return driver.findElement(By.cssSelector("a.shareitem:nth-child(1)")); 
	}
	private static WebElement twitter() {
		return driver.findElement(By.cssSelector("a.shareitem:nth-child(2")); 
}

	private static WebElement blogArchiveDropDown() {
		return driver.findElement(By.cssSelector("select#archives-dropdown-2")); 
}
	private static WebElement blogSearchBar() {
		return driver.findElement(By.cssSelector("input#s"));
	}
		
    private static WebElement blogSearchBtn() {
			return driver.findElement(By.cssSelector("id#searchsubmit")); 
    }
    private static List<WebElement> blogSearchList() {
		return driver.findElements(By.cssSelector("div.category-news")); 
}
    
    //Actions
    
    public void clickOnFacebook() {
    	facebook().click();
    }
    public void clickOnTwitter() {
    	twitter().click();
    }
    public void search(String search) {
		blogSearchBar().sendKeys(search);
    }
    public void clickOnSearch() {
    	blogSearchBtn().click();
    }
    public void selectArchiveDropDown(String s) {
    	Select blogArchiveDropDown = new Select(driver.findElement (By.cssSelector("select#archives-dropdown-2"))); 
    	blogArchiveDropDown.selectByVisibleText(s);
    }
	
	
	
}
