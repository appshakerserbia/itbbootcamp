package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchPage {
	
static WebDriver driver;
	
	public AdvancedSearchPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> customFieldList() {
		return driver.findElements(By.cssSelector("#searchForm .col-sm-2 .input-sm")); 
}
	
	private static List<WebElement> containsMenuList() {
		return driver.findElements(By.cssSelector("#searchForm .col-sm-2 > select")); 
}
	
	private static List<WebElement> fillInFieldList() {
		return driver.findElements(By.cssSelector("#searchForm .col-sm-7 > select")); 
}
	
	private static WebElement mediaTypes() {
		return driver.findElement(By.name("mediatype_query"));
	}
	
	private static List<WebElement> dateRangeList() {
		return driver.findElements(By.cssSelector("div.row:nth-child(11) > div:nth-child(3) > select")); 
	}
	
	private static List<WebElement> dateList() {
		return driver.findElements(By.cssSelector("div.row:nth-child(10) > div:nth-child(3) > select")); 
	}
	
	private static WebElement searchAdvancedBtn() {
		return driver.findElement(By.cssSelector("#searchForm > center > input.btn.btn-primary"));
	}
	
	private static WebElement queryField() {
		return driver.findElement(By.cssSelector("#rawform > input"));
	}
	
	private static List<WebElement> pickToReturnList() {
		return driver.findElements(By.cssSelector("#rawform > div:nth-child(4) > select > option")); 
}
	
	private static List<WebElement> sortResultList() {
		return driver.findElements(By.cssSelector("#rawform > div:nth-child(5) > select")); 
}
	
	private static WebElement numberOfResultsBox() {
		return driver.findElement(By.cssSelector("input#numresults"));
	}
	
	private static WebElement pageBox() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > span > input"));
	}
	
	private static List<WebElement> formatSelectorList() {
		return driver.findElements(By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr > td > input[type=radio]")); 
}
	
	private static WebElement searchJsonXmlBtn() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > input.btn.btn-primary"));
	}
	
	private static WebElement saveToFileChechBox() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr:nth-child(2) > td:nth-child(1) > input[type=checkbox]"));
	}
	
	private static WebElement helpLink() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr:nth-child(4) > td:nth-child(1) > a"));
	}
	
	


}
