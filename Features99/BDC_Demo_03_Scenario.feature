Feature: BDC validation

Background: Clearing the browser cache
Given I am clicking the shortcut for the browser cache
And Ensuring for the deletion of all the cookies

Scenario: User login Demowebshop from BDC
Given bdc user having valid creds
Then user tries provide the data for the login process

Scenario: User logout process for the BDC user
Given BDC user is able to see the logout button
Then user clicks on the logout button to close the window