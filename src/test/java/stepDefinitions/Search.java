package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.*;


public class Search {

	@Given("^I visit the website as Guset user")
	public void I_visit_the_website_as_Guest_user() {
		
		 System.out.println(">> Given - I visit the website as Guset user");
	}
	
	@When("^I select Books option from the dropdown")
	public void I_select_Books_option_from_the_dropdown() {
		
		System.out.println(">> When - I select Books option from the dropdown");
	}
	
	@And("^I click on search icon")
	public void I_click_on_search_icon() {
		
		System.out.println(">> And - I click on search icon");
	}
	
	@Then("^I should see the books page loaded")
	public void I_should_see_the_books_page_loaded() {
		
		System.out.println(">> Then - I should see the books page loaded");
	}
	
	@And("^I should see Books at Amazon heading")
	public void I_should_see_Books_at_Amazon_heading() {
		
		System.out.println(">> And - I should see Books at Amazon heading");
	}
	
	@But("^I should not see the other category products")
	public void I_should_not_see_the_other_category_products() {
		
		System.out.println(">> But - I should not see the other category products");
		System.out.println("----------------------------------------------------------");
	}
	
	@Then("^I should see the baby page loaded")
	public void I_should_see_the_baby_page_loaded() {
		
		System.out.println(">> Then - I should see the baby page loaded");
	}
	
	@And("^I should see The Baby Store at Amazon heading")
	public void I_should_see_The_Baby_Store_at_Amazon_heading() {
		
		
		  System.out.println(">> And - I should see The Baby Store at Amazon heading");
		 
	}
}
