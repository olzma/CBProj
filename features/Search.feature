Feature: Searching of various categories should be possible along with the product search

This is a bigger description, this will not be executed.
It is good to provide an option to our end users where they can search for products based on their category,
rather that only searching a product.

Background: Navigating to the website as Guest user
Given I visit the website as Guset user

@Books @All
Scenario: Search for the products under Books category
    When I select Books option from the dropdown
    And I click on search icon
    Then I should see the books page loaded
    And I should see Books at Amazon heading
    But I should not see the other category products

@Baby @All
Scenario: Search for the products under Baby category
		When I select Books option from the dropdown
    And I click on search icon
    Then I should see the baby page loaded
    And I should see The Baby Store at Amazon heading
    But I should not see the other category products
