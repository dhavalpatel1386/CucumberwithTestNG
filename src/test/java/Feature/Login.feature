Feature: LoginTest


Background: user is login
					Given I open browser and enter url
					When  I enter valid credential
					And   I click on login
					Then  I redirect to Home page of application

Scenario: Verify AssignLeave Validation
					Given   I click on assign leave 
					When   I click on assign button
					Then  It shows the validation error 

Scenario: Verify AssignLeave added successfully
					Given   I click on assign leave and fill detail
					When   I click assign button
					Then  It shows the success message




#Feature: Free CRM Login Feature
#
#Scenario Outline: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user is on home page
#Then Close the browser
#
#
#Examples:
#	| username | password |
#	| naveenk  | test@123 |
