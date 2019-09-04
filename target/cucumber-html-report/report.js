$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/nanthini.kalimuthu/Nanthini_Demo_Cucumber/Features99/BDC_Demo01.feature");
formatter.feature({
  "name": "BDC validation on demowebshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registered user access to cart in Demowebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression,"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User launched demo webshop app in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "BDC_Demo1_Definitions.user_launched_demo_webshop_app_in_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for the item of his choice",
  "keyword": "Then "
});
formatter.match({
  "location": "BDC_Demo1_Definitions.user_searches_for_the_item_of_his_choice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adds that item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "BDC_Demo1_Definitions.adds_that_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Registered user access track the ordered item in Demowebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has already placed an order for his favourite item",
  "keyword": "Given "
});
formatter.match({
  "location": "BDC_Demo1_Definitions.user_has_already_placed_an_order_for_his_favourite_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to access the order tracking dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "BDC_Demo1_Definitions.user_tries_to_access_the_order_tracking_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "identifies the state of the order",
  "keyword": "Then "
});
formatter.match({
  "location": "BDC_Demo1_Definitions.identifies_the_state_of_the_order()"
});
formatter.result({
  "status": "passed"
});
});