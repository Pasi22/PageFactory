package TestCases;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import org.testng.annotations.*;
import org.testng.Assert;
import PageClasses.*;

public class LoginTest {
	
WebDriver driver;
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		LoginPage lgPage = new LoginPage(driver);
		lgPage.setUserName("mngr193010");
		lgPage.setPassword("vuqugAz");
		lgPage.clickLogin();
		
		HomePage hmPage = new HomePage(driver);
		assertEquals(hmPage.getHomePageDashboardUserName(), "Manger Id : mngr193010");
		
		driver.close();
	}

}
