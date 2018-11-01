Feature: Free CRM Login Feature

Background: Background Example
	Given Statement background
	
@End2End
Scenario: Free CRM Login Test Scenario
Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
Then user click on login button
And close the browser

@SmokeTest
Scenario: Run smoke
Given Run Smoke

@RegressionTest
Scenario: Run Regression
Given Run Regression



