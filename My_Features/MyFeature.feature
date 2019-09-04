Feature: my validations demo for testmein BDC

Scenario: User access to guest registration
Given Application is launched by guest user
When User clicks on sign In link available 
And provides required data in the form 
Then User submits the data
And Verifies for the account creation 