package base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
	
static WebDriver driver;
	
	public LogIn (WebDriver driver) {
	    this.driver = driver;
	}
	
	
	// Elements
	private static WebElement signInButton() {
		return driver.findElement(By.cssSelector("a.nav-user"));
	}
	
	private static WebElement username() {
		return driver.findElement(By.name("username"));
	}
	private static WebElement password() {
		return driver.findElement(By.name("password"));
		
	}
	private static WebElement logInButton( ) {
		return driver.findElement(By.cssSelector(".btn"));
	}
	private static WebElement signUpFree( ) {
		return driver.findElement(By.cssSelector(".login-header > p:nth-child(3) > a:nth-child(1)"));
	}
	private static WebElement termsOfService() {
		return driver.findElement(By.cssSelector("div.terms a"));
	}
	
	private static WebElement forgotPassword() {
		return driver.findElement(By.className("reset-password"));
	}
	 private static WebElement errorMsg() {
    	 return driver.findElement(By.cssSelector("span.login-error"));
    	 
    	 
     }

	//Actions
	
	public void logClick() {
		signInButton().click();
	}
	public void signFree() {
		signUpFree().click();
	}
	public void terms() {
		termsOfService().click();
	}
	
	public void user(String e) {
		username().sendKeys(e);
	}
	
	public void sifra(String p) {
		password().sendKeys(p);
	}
	public void logIn() {
		logInButton().click();
	}

	public String getMessage() {
        WebDriverWait waiting = new WebDriverWait(driver, 10);
        WebElement errorMsg = waiting.until(ExpectedConditions.visibilityOf(errorMsg()));
        return errorMsg().getText();
	}
	
	public WebElement getLogBtn() {
		return logInButton();
	}
		
		public String getChildWindow() {
	        Set<String> window = driver.getWindowHandles();
	       Iterator iterator = window.iterator();
	       String currentWindowId = null;
	       
	       String mainPage = driver.getWindowHandle();
	       
	       while(iterator.hasNext()){
	           currentWindowId = iterator.next().toString();
	           
	           if (!currentWindowId.equals(mainPage)){
	               driver.switchTo().window(currentWindowId);
	           }
	       }
	       return driver.getCurrentUrl();
	        }
		
		
	


	
	
	
	}
	
	

