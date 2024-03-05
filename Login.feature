@all
Feature: Login Functionality
As an registered user, I want to login to the application so that I can access my account

Background:
Given user navigates to Login page

@login @validCredentials @regression
Scenario Outline: Login with valid credentials
When user enters valid username <email>
And enters valid password <password>
And clicks on submit button
Then user should login successfully
Examples:
|email                        |password|
|saiprathyusha.kaja@yexle.com |Prashya@2000|
|prathyushakaja30@gmail.com   |Sai@2000|
|ksprathyusha2000@gmail.com   |Sai@2000|

@login @invalidCredentials @smoke @regression
Scenario: Login with invalid credentials
When user enters invalid username "p@yexle.com"
And enters invalid password "P@2000"
And clicks on submit button
Then user should get a proper warning message
