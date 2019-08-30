package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {
	
	static WebDriver driver;
	
	public JobsPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	//Elements
	
	private static WebElement jobsSearchBar() {
		return driver.findElement(By.cssSelector("input#q"));
	}
	
	private static WebElement jobsSearchBtn() {
		return driver.findElement(By.cssSelector("a#btn_search_jobs")); 
	}
	
	private static WebElement jobAdvancedBtn() {
		return driver.findElement(By.cssSelector("id#link_show_advanced_search")); 
	}
	
	private static List<WebElement> jobGeneratedElementsList() {
		return driver.findElements(By.cssSelector("table#jobs_table tr")); 
}
	//Actions
	
	public int getNumberOfJobs() {
		return jobGeneratedElementsList().size();
	}
	public void search(String search) { 
		jobsSearchBar().sendKeys(search);
	}
	public void clickOnSearchBtn() {
		jobsSearchBtn().click();
	}
	

}

