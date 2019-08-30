package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPage {
	
static WebDriver driver;
	
	public CollectionPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> sortByList() {
		return driver.findElements(By.cssSelector("div.topinblock span a")); 
		}
	
	private static List<WebElement> videoList() {
		return driver.findElements(By.cssSelector("div.results div.item-ia:not(:first-child")); 
		}
	
	private static List<WebElement> radioBtnList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > form > div > fieldset > label > input[type=radio]")); 
		}
	
	private static List<WebElement> mediaTypeList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_mediatype.collapse > div.fatable.facet-mediatype > label > div > input[type=checkbox]")); 
		}
	
	private static List<WebElement> mediaBoxList() {
		return driver.findElements(By.cssSelector("div.facet_mediatype.collapse")); 
		}
	
	
	private static List<WebElement> yearList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_year.collapse > div.fatable.facet-year > label > div > input[type=checkbox]")); 
		}
	
	private static List<WebElement> yearBoxList() {
		return driver.findElements(By.cssSelector("div.facet_year.collapse")); 
		}
	
	private static List<WebElement> topicsList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_subject.collapse > div.fatable.facet-subject > label > div > input[type=checkbox]")); 
		}
	
	private static List<WebElement> topicsBoxList() {
		return driver.findElements(By.cssSelector("div.facet_subject.collapse")); 
		}
	
	private static List<WebElement> collectionList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_collection.collapse > div.fatable.facet-collection > label > div > input[type=checkbox]")); 
		}
	
	private static List<WebElement> collectionBoxList() {
		return driver.findElements(By.cssSelector("div.facet_collection.collapse")); 
	}
	
	private static List<WebElement> creatorList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_creator.collapse > div.fatable.facet-creator > label > div > input[type=checkbox]")); 
		}
	
	private static List<WebElement> creatorBoxList() {
		return driver.findElements(By.cssSelector("div.facet_creator.collapse")); 
	}
	
	private static List<WebElement> languageList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_languageSorter.collapse > div.fatable.facet-languageSorter > label > div> input[type=checkbox]")); 
		}
	
	private static List<WebElement> languageBoxList() {
		return driver.findElements(By.cssSelector("div.facet_languageSorter.collapse")); 
	}
	
	private static List<WebElement> moreLinkList() {
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div > a")); 
		}
	
	private static WebElement searchThisCollectionField() {
		return driver.findElement(By.cssSelector("#tabby-collection > div > div.columns-facets > form > input"));
	}
	
	private static List<WebElement> playOptionsList() {
		return driver.findElements(By.cssSelector("div.welcome-right>*:not(div):not(br)")); 
		}
	
	
	
	




}
