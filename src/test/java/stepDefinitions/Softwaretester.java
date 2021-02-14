package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


public class Softwaretester {

	
		@Given("^I am a \"([a-zA-Z]{1,})\" software tester$")//[a-zA-Z]{1,} only letters with one letter at least
		public void i_am_an_good_software_tester(String whatAmI) {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			System.out.println(">>Given - I am a "+whatAmI+" software tester");
		}

		@When("^I go to work$")
		public void i_go_to_work() {
		    
			System.out.println(">>When - I go to work");
		}
		
		@And("^I \"([a-zA-Z]{1,})\" with it$")
		public void i_involve_with_it(String howIwork) {
		    
			System.out.println(">>And - I "+howIwork+" with it");
		}
		
		@Then("^My boss \"([^\"]*)\" me$")
		public void my_boss_loves_me(String whatSaysBoos) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			System.out.println(">>Then - Then My boss "+whatSaysBoos+" me");
			System.out.println("");
			//int a=10/0;
		}
		
		static {System.out.println(" ");
		
		}
		
		
		



	
	
}
