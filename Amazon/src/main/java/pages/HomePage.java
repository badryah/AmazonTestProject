package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy (name =  "q")
	WebElement searchbox;
	
	@FindBy(partialLinkText  ="https://www.amazon.com")
	public WebElement searchresutl;
	
	public void searchforamazonsite(String search) throws InterruptedException {
		setTextElementText(searchbox, search);
		clickButton(searchresutl);
	}

}
