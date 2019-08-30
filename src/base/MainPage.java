package base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Base {
	
	static WebDriver driver;
	
	public MainPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> topCollections() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia")); 
}
	private static List<WebElement> internetArchive() {
		return driver.findElements(By.cssSelector(".mt-big a"));
	}
	
	private static WebElement mainSearchBar() {
	     return driver.findElement(By.cssSelector("input.form-control:nth-child(2)")); 
	}
	private static List<WebElement> mainSearchMenu() {
	 		return driver.findElements(By.cssSelector("div#search_options label")); 
	     
	}
	private static WebElement divDropDown() {
        return driver.findElement(By.cssSelector("div#search_options"));
    }
	
	
	private static WebElement goBtn() {
	    return driver.findElement(By.cssSelector("button.btn")); 
	}
	private static WebElement advancedSearch() {
	    return driver.findElement(By.cssSelector("a.search-options__advanced-search-link")); 
	}
	
	private static WebElement seeMore() {
	    return driver.findElement(By.cssSelector(".hero-right a.stealth")); 
	}
	
	//Actions
	
	public int getNumberOfCollections() {
		return topCollections().size();
	}
	public void getNumberOfArchiveIcons(int i) { 
		internetArchive().get(i).click();
	}
	
	public String getTextFromCollections() {
		return topCollections().get(0).getText();
	}
		
      public List<String> getTextCollections() {
	  
      List<String> TextList = new ArrayList<String>();
	  for (int i = 0; i < topCollections().size(); i++) {
	  TextList.add(topCollections().get(i).findElement(By.cssSelector("div.item-ia.collection-ia div.num-items.topinblock")).getText());
	   }
	  return TextList;

	}
		
	public void searchBarClick() {
		mainSearchBar().click();
	}
	public WebElement getdivDropDown() {
        return divDropDown();
    }

	
	public void search(String search) { 
		mainSearchBar().sendKeys(search);
	}

		public void goClick() {
			goBtn().click();
		}
		
		public List<WebElement> getList() {
			return topCollections();
		}
		
		}
		
		
		
	
	
	
	
	
	


