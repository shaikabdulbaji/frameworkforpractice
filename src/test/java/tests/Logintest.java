package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.Base;

public class Logintest extends Base {
	

	
	public WebDriver driver;
	
	@Test(dataProvider="getlogindata")
	public void login(String username, String password, String expectedstatus) throws IOException, InterruptedException
	{
		
		Landingpage lp1 = new Landingpage(driver);
		WebElement lable = lp1.loginheadline();
		System.out.println(lable.getText());
		
		
		Thread.sleep(3000);
		
		Loginpage lp = new Loginpage(driver);
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.loginbtn().click();
		

		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void openbrowser() throws IOException
	{
		
		driver = initilizeDrivers();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getlogindata()
	{
		Object[][] data = {{"Admin","admin123","Successfull"},{"Admin1","admin123","Failure"}};
		
		return data;
	}
	
	
	

}
