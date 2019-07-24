package utilities;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	//Open Browser
	//Navigate to URL
	//Close Browser

	ReadProperties prop = new ReadProperties();
	protected WebDriver driver = null;
	SelectBrowser s = new SelectBrowser();

		
	@BeforeMethod	
	public void launchBrowser() throws IOException{
		String URL = prop.readPropertyfile("URL");
		driver = s.getBrowser();
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void CloseBrowser(){
		driver.close();
		driver.quit();
	}
}
