package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base {
	
	public WebDriver driver;
	@Test
	public void testthree() throws InterruptedException, IOException
	{
		System.out.println("ThreeTest");
		
		driver = initilizeDrivers();
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
