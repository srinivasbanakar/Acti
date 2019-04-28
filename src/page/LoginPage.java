package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
