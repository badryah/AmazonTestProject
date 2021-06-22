package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class SearchTest extends TestBase {
	
	HomePage homepage;
	
	@Test
	public void searchforamazon() throws InterruptedException
	
	{
		homepage = new HomePage(driver); 
		homepage.searchforamazonsite("Amazon" + "\n");
		//Thread.sleep(3000);
		//Assert.assertTrue(home.verifycontenth1.getText().contains("Practice"));
		
		Assert.assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());

		
	}

}
