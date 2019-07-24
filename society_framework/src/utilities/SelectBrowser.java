package utilities;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectBrowser {
	//ReadPropertiesFile prop = new ReadPropertiesFile()
	 Logger log = Logger.getLogger("Select Browser");
	 ReadProperties prop = new ReadProperties();

	WebDriver driver = null;

	public WebDriver getBrowser() throws IOException{
		
		String browser = prop.readPropertyfile("browser");
		while (browser == null){
			log.info("Browser is not specified");
			System.exit(0);
		
		}
		if (browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			log.info("Firefoxbrowser is selected");
		}
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\Pritam\\Software Testing Practice\\Software\\cromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Chrome Browser is selected");
		}
	
		// You can add Other Browser like Chrome ,ie etc..
		
		return driver;
	}
}
