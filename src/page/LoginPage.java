package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(name="username")
	private WebElement un;
	 public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
