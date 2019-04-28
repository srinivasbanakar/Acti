package scripts;

import org.testng.annotations.Test;

import generic.Base;
import page.LoginPage;

public class ValidLogin extends Base
{
	@Test
	public void testValidLogin()
	{
		LoginPage l=new LoginPage(driver);

	}
	

}
