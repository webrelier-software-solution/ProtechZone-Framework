package testScripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import utilities.BaseTest;
import utilities.ExcelReader;

public class LoginTest extends BaseTest {
ExcelReader er = new ExcelReader();
	
	@Test(dataProvider = "logindata")
	public void LoginTestcase(String Username , String Password) throws InterruptedException{
		//Manual TestCase
		/*Click on Login
		Enter Username 
		Enter Password 
		Click ok*/
		String eurl = "http://protechzone.in/index.aspx";
		  	HomePage.LoginLinkObject(driver).click();
		  	LoginPage.EmailFieldObject(driver).sendKeys(Username);
		  	LoginPage.PasswordFieldObject(driver).sendKeys(Password);
		  	LoginPage.LoginButtonObject(driver).click();
		  	Thread.sleep(4000);
		  	String aurl = driver.getCurrentUrl();
		  	Assert.assertEquals(aurl, eurl);
		  	
	}
	
	//datadriven - We should supply the data
	
	@DataProvider(name = "logindata")
	public Object[][] TestDataSupply() throws Exception{
		return er.getExceData();
		//data provider always returns an array of object 2D 
	
				
	}
}
