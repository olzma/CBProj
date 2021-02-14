Feature: Registration Test

Test the data tables with registration which needs more fileds to be filed in

@register @All
Scenario: Register an new acount
Given User navigates to registration section
When User provides the following details into the input fields
	|firstName |arun				|
	|lastName  |motoori			|
	|email		 |io3@yahoo.com|
	|phone		 |08762673223 |
	|password  |12345pass   |
And Select the privacy policy option
And Click Continue button to register
Then User is register successfully
		