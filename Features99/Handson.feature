Feature: Demo webshop login process

Background: Login process in demo webshop
Given launching the website
And User login with valid creds in demo webshop 
Then click on login button



Scenario: User adds item to the cart
Given User searches for the item
And clicks on add to cart
Then click on log out

Scenario: User adds another item to the cart
Given User searches for the other item
And User clicks again on add to cart
Then User again logout the browser