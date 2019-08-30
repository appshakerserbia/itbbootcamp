package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {
	
	static WebDriver driver;
	
	public ProjectsPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static List<WebElement> projectsList() {
		return driver.findElements(By.cssSelector("div.row.xxx")); 
}
	
	//Elements
	public int getNumberOfProjects() {
		return projectsList().size();
	}
	

}
