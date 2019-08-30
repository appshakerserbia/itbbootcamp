package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test() throws Exception{
		
     driver.navigate().to(URLs.MAIN_PAGE);
		        
     MainPage MP = new MainPage(driver);
		        
     String a=driver.findElements(By.cssSelector("div.num-items")).get(0).getText();
	 int sc=Integer.parseInt(a.replaceAll("\\D",""));
	 MP.getList().get(0).click();
		        
     String b=driver.findElement(By.cssSelector("div.results_count")).getText();
		        int sc1=Integer.parseInt(b.replaceAll("\\D",""));
		  
		        
     Assert.assertTrue(a.contains(b));
		        
		    

}
}
