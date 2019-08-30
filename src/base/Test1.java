package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
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
		
		Assert.assertTrue(MP.getNumberOfCollections()>20);
		
		for(int i = 0; i < MP.getTextCollections().size(); i++) {
            Assert.assertTrue(MP.getTextCollections().get(i).contains("ITEMS"));
        }
		

}
}
