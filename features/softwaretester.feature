Feature: Life of a software tester and his boss


##these are very similar only some words are different: good,involve,loves ,average,work,ingores bad,mess,hates

@RunOnlyForSmokeTest @All @good
Scenario: I am a good software tester and by boss loves me
Given I am a "good" software tester
When I go to work
And I "involve" with it
Then My boss "loves" me

@RunOnlyForSmokeTest @All @average
Scenario: I am an average software tester and my boss ingores me
Given I am a "average" software tester
When I go to work
And I "work" with it
Then My boss "ingores" me

@All @bad
Scenario: I am a bad software tester and my boss hates me
Given I am a "bad" software tester
When I go to work
And I "mess" with it
Then My boss "hates" me

#@dev this is not developed  these are default values , standard used by everyone
#@wip this is not ready yet
#@ignore a scenario
@All @dev @ignore @wip
Scenario: This is not yet developed
Given I am a "super" software tester
When I go to work
And I "shine" with it
Then My boss "double-pays" me