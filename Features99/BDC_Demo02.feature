Feature: Guest user action in Demo webshop
@Sanity
Scenario: User choice to opt for the account
Given user access the signup page
And gets the credentials



@Regression
Scenario: User access to login page of the Demo webshop
Given User has valid account creds for Demowebshop
And Provide valid creds as input for the login process
Then Verifies the state for the login status

