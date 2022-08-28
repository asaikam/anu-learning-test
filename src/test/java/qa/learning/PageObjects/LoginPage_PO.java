package qa.learning.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PO {
	public WebDriver driver;

	@FindBy(id = "user-name")
	WebElement USER;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	@FindBy(name ="password")
	WebElement PASSWORD;
	
	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement compose;
	
	public LoginPage_PO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void enteruid(String userid) {
		USER.sendKeys(userid);

	}

	public void enterpwd(String password) {
		PASSWORD.sendKeys(password);

	}
	
	public void login(String userid, String password) {

		enteruid(userid);
		loginBtn.click();
		enterpwd(password);
		loginBtn.click();
	}
	

}
