package qa.learning.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.learning.DataManagement.PropertyFileReader;
import qa.learning.PageObjects.HomePage_PO;
import qa.learning.PageObjects.LaunchBrowser_PO;
import qa.learning.PageObjects.LoginPage_PO;
import qa.learning.Utility.BaseClass;

public class LoginPage_StepDefination extends BaseClass {
	LaunchBrowser_PO lb;

	@Given("^user is in login page$")
	public void user_is_in_login_page() throws InterruptedException {
		BaseClass.Launch_Browser();
		lb = new LaunchBrowser_PO(driver);
		lb.swagLabslUrl();
	}

	@When("^enter user credentials$")
	public void enter_user_credentials() {
		String pUserName = PropertyFileReader.fn_ReadPropertyFile().getProperty("username");
		String pPassword = PropertyFileReader.fn_ReadPropertyFile().getProperty("password");
		LoginPage_PO lp = new LoginPage_PO(driver);
		lp.login(pUserName, pPassword);

	}

	@Then("^sucessful login to SWAGLABS home page$")
	public void sucessful_login_to_swagLabs_home_page() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		HomePage_PO hp = new HomePage_PO(driver);
		hp.homePage();
		lb.browerQuit();

	}
}
