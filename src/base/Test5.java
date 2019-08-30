package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {
	
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test() throws Exception{
		
		NavigationMenu NM = new NavigationMenu(driver);
		
		driver.navigate().to(URLs.MAIN_PAGE);
		
		NM.uploadClick();
		
		Assert.assertTrue(NM.getMessage().contains("Log in or Sign up"));  
		

}
}
