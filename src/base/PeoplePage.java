package base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {
	
static WebDriver driver;
	
	public PeoplePage (WebDriver driver) {
	    this.driver = driver;
	}
	
	//Elements
	
	private static List<WebElement> peopleBiosList() {
		return driver.findElements(By.cssSelector("div.bio  div:not(.bio)"));
	}
	
	//Actions
	
	public List<String> getPeopleInfo() {
    
    List<String> infoPeople = new ArrayList<String>();
        for (int i = 0; i < peopleBiosList().size(); i++) {
            String s = peopleBiosList().get(i).findElement(By.cssSelector("b")).getText();
            String s1 = "";
            if(!(i==14 || i==15)) {
             s1 = peopleBiosList().get(i).findElement(By.cssSelector("div.bio div:not(.bio):not(p) > i, a > i")).getText();
            }
            infoPeople.add(s + " " + s1);
        }
        return infoPeople;
    }

		
	}
	
	



