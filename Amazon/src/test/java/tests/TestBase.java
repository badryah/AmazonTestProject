package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class TestBase {
	public static WebDriver driver;	

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		//get("https://www.amazon.com/");
	}
	
	private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
       options.setHeadless(true);// the page not open
        return options;
    }
	
	@AfterSuite
	public void stopDriver() 
	{
		driver.quit();
	}

}
