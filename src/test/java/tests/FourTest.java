package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base {
	
	public WebDriver driver;
	
	@Test
	public void testfour() throws Exception
	{
		System.out.println("FourTest");
		
		driver = initilizeDrivers();
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}
