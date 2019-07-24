package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	// Page Objects from Login Page
	 // User Name field
		//Password field
		//Login Button
		
	static	String EmailFieldXpath = "//*[@id=\"ContentPlaceHolder1_txt_username\"]";
	static	String PasswordFieldXpath = "//*[@id=\"ContentPlaceHolder1_txt_password\"]";
	static	String LoginButtonXpath ="//*[@id=\"ContentPlaceHolder1_btn_login\"]";
		
		public static WebElement EmailFieldObject(WebDriver driver){
			return driver.findElement(By.xpath(EmailFieldXpath));
		}
		//For Password
		public static WebElement PasswordFieldObject(WebDriver driver){
			return driver.findElement(By.xpath(PasswordFieldXpath));
		}
		
		// For Login
		public static WebElement LoginButtonObject(WebDriver driver){
			return driver.findElement(By.xpath(LoginButtonXpath));
		}
}
