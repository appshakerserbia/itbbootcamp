package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test6 {
	
	public static final String e = "foo@gmail.com";
	public static final String p = "bar";
	
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test() throws Exception{
		
		NavigationMenu NM = new NavigationMenu(driver);
		LogIn LI = new LogIn(driver);
		
		driver.navigate().to(URLs.MAIN_PAGE);
		
		NM.signIn();
		
		Assert.assertTrue(LI.getLogBtn().isDisplayed());
		
		LI.user(e);
		LI.sifra(p);
		LI.logIn();
		
		Assert.assertTrue(LI.getMessage().contains("Email address and/or Password incorrect"));  
		
		

}
}
