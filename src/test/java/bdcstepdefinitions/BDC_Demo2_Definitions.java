package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BDC_Demo2_Definitions {
	@Given("user access the signup page")
	public void user_access_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user access the signup page");
	}

	@Given("gets the credentials")
	public void gets_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("gets the credentials");
	}

	@Given("User has valid account creds for Demowebshop")
	public void user_has_valid_account_creds_for_Demowebshop() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User has valid account creds for Demowebshop");
	}

	@Given("Provide valid creds as input for the login process")
	public void provide_valid_creds_as_input_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Provide valid creds as input for the login process");
	}

	@Then("Verifies the state for the login status")
	public void verifies_the_state_for_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Verifies the state for the login status");
	}
}
