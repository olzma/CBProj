Feature: Login Tests

This feature file will contain alll the test scenarios ralated with Login functionallity of the applications

@ninja @All
Scenario: Login with valid credetials
This is the description only for this scenario. This is a good case.
	Given User navigates to login page of the application
	When User go to login section
	And User add the username "oliver.zmarandache@gmail.com" as a user
	And User add the password "ninjasite" as a password
	And User press login button
	Then User enters succesfully into user section
	But Make sure this really works and search an item

