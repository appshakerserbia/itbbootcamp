package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
	
static WebDriver driver;
	
	public UploadPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	private static WebElement uploadFilesBtn() {
		return driver.findElement(By.cssSelector("a.buttonG btn btn-success"));
	}
	
	private static WebElement liveMusicBtn() {
		return driver.findElement(By.cssSelector("a.btn btn-primary"));
	}
	
	private static WebElement questionBtn() {
		return driver.findElement(By.cssSelector("a.stealth"));
	}


}
