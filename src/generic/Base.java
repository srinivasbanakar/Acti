package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
