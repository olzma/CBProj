package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	
		WebDriver driver=null;
	
		@Given("^User navigates to registration section$")
		public void user_navigates_to_registration_section() {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		}

		@When("^User provides the following details into the input fields$")
		public void user_provides_the_following_details_into_the_iput_fields(io.cucumber.datatable.DataTable dataTable) {
		
			//use dataTable to get all the fields from feature files and fill the fields
			Map<String,String> map =dataTable.asMap(String.class, String.class);
			driver.findElement(By.id("input-firstname")).sendKeys(map.get("firstName"));
			driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastName"));
			driver.findElement(By.id("input-email")).sendKeys(map.get("email"));
			driver.findElement(By.id("input-telephone")).sendKeys(map.get("phone"));
			driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
			driver.findElement(By.id("input-confirm")).sendKeys(map.get("password"));
		
		}
		@And("^Select the privacy policy option$")
		public void select_the_privacy_policy_option() {
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		   
		}
		@And("^Click Continue button to register$")
		public void click_continue_button_to_register() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			//input[@type='submit']
		    
		}
		@Then("^User is register successfully$")
		public void user_is_register_successfully() {
			
			String urlString=  driver.getCurrentUrl();
			if(urlString.equals("http://tutorialsninja.com/demo/index.php?route=account/success")) {
				System.out.println("User is now registered and can go and login");
			}else {
				System.out.println("User cannot register!");
				Assert.fail("User cannot register!");
			}
				
		    
		}



	
	
}
