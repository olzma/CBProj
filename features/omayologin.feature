Feature: Login to the omayo application

@All @login 
Scenario Outline: User should only be able to login with valid credentials
Given I navigate to omayo website
When I enter Username as "<username>" and password as <password> fields
## don't end this with param e.g.<password>, add extra text so this steps can match with your method
## we can use "" to enclose the <> but we need to add that also on @Given of method
And I click on login button
Then User should login based on expected : <loginstatus> status.

Examples: 
|username					|password|loginstatus|
|arun    					|test123 |failure    |
|SeleniumByArun		|Test143$|success    |
|motoori					|test		 |failure    |

