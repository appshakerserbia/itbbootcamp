package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	
	public static final String search = "qa";
	
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test() throws Exception{
		
        MainPage MP = new MainPage(driver);
		
		driver.navigate().to(URLs.MAIN_PAGE);
		
		MP.searchBarClick();
		Assert.assertTrue(MP.getdivDropDown().isDisplayed());
		MP.search(search);
		MP.goClick();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=qa"));
		
		
		
}
}
