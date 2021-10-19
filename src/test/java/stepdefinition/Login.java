package stepdefinition;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.Base;

public class Login extends Base {
	
		WebDriver driver;
		Landingpage lp1;
		Loginpage lp;

	    @Given("^Open any Browser$")
	    public void open_any_browser() throws Throwable {
	        
	    	driver = initilizeDrivers();
			
	    }
	    
	    @And("^Navigate to Login page$")
	    public void navigate_to_login_page() throws Throwable {
	        
	    	driver.get(prop.getProperty("url"));
	    	lp1 = new Landingpage(driver);
			WebElement lable = lp1.loginheadline();
			System.out.println(lable.getText());
			
			Thread.sleep(3000);
			
	    }

	    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String username, String password) throws Throwable {
	       
	    	lp = new Loginpage(driver);
			lp.username().sendKeys(username);
			lp.password().sendKeys(password);
			
	    }

	    @Then("^User clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	lp.loginbtn().click();
	    	
	    	Thread.sleep(4000);
	    	
	    	driver.close();
	    }
	 

	}


