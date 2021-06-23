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
		driver.get("https://www.amazon.com/");
		//get("https://www.amazon.com/");
	}

	@AfterSuite
	public void stopDriver() 
	{
		driver.quit();
	}

}
