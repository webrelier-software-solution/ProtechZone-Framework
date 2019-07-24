package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	//Page Objects from Home Page
	//Login Link
		static String LoginLinkXpath ="//*[@id=\"a_login\"]";
		
		public static WebElement LoginLinkObject(WebDriver driver){
			return driver.findElement(By.xpath(LoginLinkXpath));
		}
		
}
