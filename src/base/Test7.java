package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test7 {
	
	public static final String URL = "terms";
	
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test() throws Exception{
		
		driver.navigate().to(URLs.MAIN_PAGE);
        
		NavigationMenu NM = new NavigationMenu(driver);
        
		LogIn LI = new LogIn(driver);
        
		NM.signIn();
		
        
		Assert.assertTrue(driver.getPageSource().contains("Forgot password"));
        
		LI.signFree();
        LI.terms();
    
        Thread.sleep(5000);
       
        Assert.assertTrue(LI.getChildWindow().toLowerCase().contains(URL));
        
		
	}
}
