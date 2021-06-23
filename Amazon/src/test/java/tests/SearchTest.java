package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class SearchTest extends TestBase {

	HomePage homepage;

	@Test
	public void get_the_list_of_types_of_a_particular_product() throws InterruptedException 

	{
		homepage = new HomePage(driver); 
		homepage.listproduct();

	}

}
