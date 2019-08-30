package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMenu {
		
		static WebDriver driver;
			
			public NavigationMenu (WebDriver driver) {
			    this.driver = driver;
			}
	
			//Elements navigation menu		

			
			private static List<WebElement> icons() {
				return driver.findElements(By.cssSelector("ul.navbar-main li.pull-left")); 
			}
				
			private static WebElement logo() {
			    return driver.findElement(By.cssSelector("a.navbar-brand")); 
				
				
			}
			private static WebElement signInBtn() {
				return driver.findElement(By.cssSelector("a.nav-user")); 
			}
			private static WebElement uploadBtn() {
				return driver.findElement(By.cssSelector("a.nav-upload"));  
			}
			
			private static WebElement smallSearchBar() {
				return driver.findElement(By.cssSelector("input#search-bar-2"));
			}
			private static WebElement smallSearchBarBtn() {
				return driver.findElement(By.cssSelector("li#nav-search a"));
			}
			private static WebElement uploadMessage() {
				return driver.findElement(By.cssSelector(".container > p:nth-child(1)"));
			}
			
			
			
			
			
			//Web hidden menu
			
			private static WebElement searchBar() {
				return driver.findElement(By.cssSelector("input#nav-wb-url"));
			}
			private static WebElement webPagesLink() {
				return driver.findElement(By.cssSelector(".wayback-text a"));
			}
			private static WebElement wayBackMachineLogo() {
				return driver.findElement(By.cssSelector("div.col-sm-6"));
			}
			private static WebElement userNameBtn() {
				return driver.findElement(By.cssSelector("#user-menu > span:nth-child(2)"));
			}
			
			//Lists of other elements in hidden menu
			
			private static List <WebElement> listIconRounded(){
		         return driver.findElements(By.className("items_list_img")); 
		     }
		     private static List <WebElement> listOfLinks(){
		         return driver.findElements(By.cssSelector(".linx a"));
		     }
		     
		   
			
			
			//Actions navigation menu
			
		
			public void logoClick() { //click on archive.org logo
				logo().click();
			}
			public void signIn() { //sign in click
				signInBtn().click();
			}
			public void uploadClick() { //upload click
				uploadBtn().click();
			}
			public void clickOnIcon(int i) { //clicks on one of 6 nav menu icons
				icons().get(i).click();
			}
			public void clickOnUser() { //click on username
				userNameBtn().click();
			
			}
			
			public void searchBar(String search) { // search bar
				smallSearchBar().sendKeys(search);
			}
			public void clickSearchBar() { // search bar, click to search
				smallSearchBarBtn().click();
			}
			
			public void clickIconRounded(int i) { //clicks on rounded icons
				listIconRounded().get(i).click();
			}
			public void clickListofLinks(int i) { //clicks on one of the links
				listOfLinks().get(i).click();
			}
			
			//Web hidden menu actions
			
			public void search(String search) { //waybackmachine search bar
				searchBar().sendKeys(search);
			}
			public void clickSearchUrl() {
		        searchBar().sendKeys(Keys.ENTER); //waybackmachine search bar press enter
		    }
			
			public void link() {
				webPagesLink().click();
			}
			public void wayBackMachine() {
				wayBackMachineLogo().click();
			}
			public String getMessage() {
		        WebDriverWait waiting = new WebDriverWait(driver, 10);
		        WebElement uploadMessage = waiting.until(ExpectedConditions.visibilityOf(uploadMessage()));
		        return uploadMessage().getText();
			}
			
			
		
			
			
	
			


}
