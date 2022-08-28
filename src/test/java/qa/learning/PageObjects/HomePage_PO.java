package qa.learning.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PO {
	public WebDriver driver;
	
	public HomePage_PO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//span[contains(text(),'Products')]")
	WebElement Title;

	
	public void homePage() {
		String title = Title.getText();
		System.out.println(title);
		
	}

}
