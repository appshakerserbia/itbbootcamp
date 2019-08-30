package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestArchive {
	
	public static final String SEARCH = "qa";
	
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	 public void Test1() throws Exception{
		
		AboutPage AP = new AboutPage(driver);
		AdvancedSearchPage ASP = new AdvancedSearchPage(driver);
		BlogPage BP = new BlogPage(driver);
		CollectionPage CP = new CollectionPage(driver);
		CommunityAbout CA = new CommunityAbout(driver);
		ContactPage CONTP = new ContactPage(driver);
		DonatePage DP = new DonatePage(driver);
		HelpPage HP = new HelpPage(driver);
		JobsPage JP = new JobsPage(driver);
		LogIn LI = new LogIn(driver);
		MainPage MP = new MainPage(driver);
		NavigationMenu NM = new NavigationMenu(driver);
		NewsFeedPage NFP = new NewsFeedPage(driver);
		NewsFeedSubject NFS = new NewsFeedSubject(driver);
	    PeoplePage PP = new PeoplePage(driver);
	    ProjectsPage PROP = new ProjectsPage(driver);
	    UploadPage UP = new UploadPage(driver);
	    PageLinks PL = new PageLinks(driver);
	    VolunteerPage VP = new VolunteerPage(driver);
	    WayBackMachine WBM = new WayBackMachine(driver);
	    
	    driver.navigate().to(URLs.PEOPLE_PAGE);
	   // driver.switchTo().frame(driver.findElement(By.id("resumator-job-frame")));
	   // NM.signIn();
	   // Thread.sleep(5000);
	   // LI.user();
	    //LI.sifra();
	   // LI.logIn();
	    
		//CONTP.clickOnMap(1);
	    
	   // JP.search(SEARCH);
	    //JP.clickOnSearchBtn();
	    
	   // int number = JP.getNumberOfJobs();
	   // System.out.println(number);
	    
	   
	    System.out.println(PP.getPeopleInfo());
	    
	    
	    
		

}
}
