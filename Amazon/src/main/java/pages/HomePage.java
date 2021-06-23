package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a#nav-hamburger-menu")
	WebElement alllist;

	@FindBy(linkText = "Amazon Music")
	public WebElement musicproducts;


	@FindBy(tagName = "li") 
	public List<WebElement> listofmusicproducts;

	public void listproduct() throws InterruptedException {
		clickButton(alllist);
		clickButton(musicproducts);
		System.out.println(musicproducts.getText() + "\t");
		Thread.sleep(4000);
		for(WebElement e : listofmusicproducts) {
			String str = e.getText();
			System.out.println(str);
		}

	}

}
