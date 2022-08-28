package qa.learning.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import qa.learning.Utility.BaseClass;

public class LaunchBrowser_PO extends BaseClass
{
	
	public WebDriver driver;
	
	public LaunchBrowser_PO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void swagLabslUrl()
	{
		System.out.println("Pritning the URL " + pURL );
		driver.get(pURL);
	}
	
	public void browerQuit()
	{
		driver.quit();
	}

}
