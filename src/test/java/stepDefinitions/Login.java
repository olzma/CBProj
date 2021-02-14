package stepDefinitions;

import io.cucumber.datatable.internal.difflib.myers.MyersDiff;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
		WebDriver driver;
	//You can implement missing steps with the snippets below:

		@Given("User navigates to login page of the application")
		public void user_navigates_to_login_page_of_the_application() {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://www.tutorialsninja.com/demo/");
		    
		}

		@When("^User go to login section$")
		public void user_go_to_login_section() {
			driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		    
		}

		@And("^User add the username \"(.*)\" as a user$")
		public void user_add_the_username(String username) {
		   driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}

		@And("^User add the password \"(.*)\" as a password$")
		public void user_add_the_password(String password) {
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    
		}

		@And("^User press login button$")
		public void user_press_login_button() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		}

		@Then("^User enters succesfully into user section$")
		public void user_enters_succesfully_into_user_section() {
			
			System.out.println("Now we are logged");
		  
		}

		@But("^Make sure this really works and search an item$")
		public void make_sure_this_really_works_and_search_an_item() {
			System.out.println("Now I am logged and let's find and element like My Account");
			String isElementString=null;
			try{
				 isElementString =driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).getText();
		    	
			}catch (org.openqa.selenium.NoSuchElementException e) {
				Assert.assertNotNull("Failed to find element", isElementString);
			}
		    
		}

	
	
	
}
