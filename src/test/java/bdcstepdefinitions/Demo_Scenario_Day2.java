package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demo_Scenario_Day2 {
	@Given("I am clicking the shortcut for the browser cache")
	public void i_am_clicking_the_shortcut_for_the_browser_cache() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
        System.out.println("I am clicking the shortcut for the browser cache");
	}

	@Given("Ensuring for the deletion of all the cookies")
	public void ensuring_for_the_deletion_of_all_the_cookies() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Ensuring for the deletion of all the cookies");
	}

	@Given("bdc user having valid creds")
	public void bdc_user_having_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("bdc user having valid creds");
	}

	@Then("user tries provide the data for the login process")
	public void user_tries_provide_the_data_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user tries provide the data for the login process");
	}

	@Given("BDC user is able to see the logout button")
	public void bdc_user_is_able_to_see_the_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("BDC user is able to see the logout button");
	}

	@Then("user clicks on the logout button to close the window")
	public void user_clicks_on_the_logout_button_to_close_the_window() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user clicks on the logout button to close the window");
	}

}
