package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.Driver;
import junit.extensions.TestSetup;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class omayologin {

	WebDriver driver;
	
	
	@Before("@login")//this only for scenarios from omayologin.feature will be executed
	//if we have only @Before this is run for all scenarios from Runnable
	public void TestSetup() {
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Given("^I navigate to omayo website$")
	public void i_navigate_to_omayo_website() {
		//write code here that does teh action
		//throw new PendingException();
		
		
		driver.get("http://www.omayo.blogspot.com");
		
		
	}
	
	@When("^I enter Username as \"([^\"]*)\" and password as ([^\"]*) fields$")
	// [^\"]* this means can take anything and we add () so we can pass to the method as param																		
	public void i_enter_Username_and_password(String username,String password) throws InterruptedException{
		driver.findElement(By.name("userid")).sendKeys(username);
		Thread.sleep(500);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		Thread.sleep(500);
		
	}
	
	@And("^I click on login button$")
	public void i_click_on_login_button() throws InterruptedException{
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();
		Thread.sleep(500);
	}
	
	@Then("^User should login based on expected : ([^\"]*) status.$")
	public void user_should_login_based_on_expected_status(String expectedStatus)  {
		
		String expectedLoginStatus =expectedStatus;
		String actualLoginStatus =null;
		
		try {

		Alert alert =driver.switchTo().alert();
		String textOnAlert =alert.getText();
		System.out.println(textOnAlert);
		alert.accept();
		//driver.navigate().back();
		
		if(textOnAlert.equals("Error Password or Username")) {
			
			actualLoginStatus="failure";
		}
		
		}catch ( org.openqa.selenium.NoAlertPresentException e) {
			actualLoginStatus ="success";
			System.out.println(actualLoginStatus+ "--------------- actualLoginStatus");
		}
		
		if(actualLoginStatus.equals(expectedLoginStatus)) {
			
			//Test case will pass
			//Assert.assertTrue(true);
			System.out.println("----equals-----This is the actual status: "+actualLoginStatus+"---This is the expected status: "+expectedLoginStatus);
		}else {
			
			//Test fail
			System.out.println("----notequals-----This is the actual status: "+actualLoginStatus+"---This is the expected status: "+expectedLoginStatus);
			
			//Assert.fail("Login failed");
		}
	}
	
	@After("@login")
	public void closure() {
		driver.quit();
	}
	
		
	
}
