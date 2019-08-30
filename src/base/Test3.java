package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test() throws Exception{
		
		NavigationMenu NM = new NavigationMenu(driver);
		MainPage MP = new MainPage(driver);
		
		driver.navigate().to(URLs.MAIN_PAGE);
		
		NM.clickOnIcon(1);
		NM.clickListofLinks(0);
		String s=driver.getCurrentUrl();
		driver.navigate().back();
		MP.getNumberOfArchiveIcons(1);
		String n=driver.getCurrentUrl();
		
		Assert.assertEquals((s), (n));
		
		


}
}
