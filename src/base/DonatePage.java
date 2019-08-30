package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {
	
	 static WebDriver driver;
		
		public DonatePage (WebDriver driver) {
		    this.driver = driver;
		}
		
		//Elements
		
		private static List<WebElement> amountDonateList() {
			return driver.findElements(By.cssSelector(".donation-radio-list.donationlevel> li"));
		}
		
		private static WebElement otherAmountDonate() {
			return driver.findElement(By.cssSelector("id#amount_custom")); 
		}
		
		//Actions
		
		public void clickOnAmmount(int i) { //clicks on one of the amounts
			amountDonateList().get(i).click();
		}
		
		public void otherAmountClick() { 
			otherAmountDonate().click();
		}

		
		public void otherAmount(String s) { 
			otherAmountDonate().sendKeys(s);
		}

}
