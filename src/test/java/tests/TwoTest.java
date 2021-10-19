package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base {
	
	public WebDriver driver;
	@Test
	public void testtwo() throws IOException, InterruptedException
	{
		System.out.println("TwoTest");
		
		driver = initilizeDrivers();
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
		Assert.assertTrue(false);
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}


}
