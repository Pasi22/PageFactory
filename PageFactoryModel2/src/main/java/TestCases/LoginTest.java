package TestCases;
import Utility.*;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import org.testng.annotations.*;
import org.testng.Assert;
import PageClasses.*;

public class LoginTest {
	
WebDriver driver;
	
	@Test
	public void test() throws IOException
	{
		ReadExcel reExcel = new ReadExcel();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(reExcel.readExcel(1, 0, ".\\Data\\Data.xlsx", "Sheet1"));
		LoginPage lgPage = new LoginPage(driver);
		lgPage.setUserName(reExcel.readExcel(1, 1, ".\\Data\\Data.xlsx", "Sheet1"));
		lgPage.setPassword(reExcel.readExcel(1, 2, ".\\Data\\Data.xlsx", "Sheet1"));
		lgPage.clickLogin();
		
		HomePage hmPage = new HomePage(driver);
		assertEquals(hmPage.getHomePageDashboardUserName(), reExcel.readExcel(1, 3, ".\\Data\\Data.xlsx", "Sheet1"));
		
		driver.close();
	}

}
