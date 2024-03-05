@all
Feature: Search Functionality

Background:
Given user opens the application

@valid @smoke @search @regression
Scenario: Search for a valid product
When user enters valid product into search field
And user clicks on search button
Then valid product should be displayed in search results

@invalid @regression
Scenario: Search for a non-existing product
When user enters non-existing product into search field
And user clicks on search button
Then proper text informing the user about no product matching should be displayed

@noproduct @regression
Scenario: Search without providing any product
When user don't enter any product into search field
And user clicks on search button
Then proper text informing the user about no product matching should be displayed


