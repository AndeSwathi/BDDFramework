package stepDefFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinkedIn_Login {

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_is_on_login_page");

	}

	@When("^Title of the page is LinkedIn$")
	public void title_of_the_page_is_LinkedIn() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("title_of_the_page_is_LinkedIn");
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_enters_username_and_password");
	}

	@Then("^clcik on login button$")
	public void clcik_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("clcik_on_login_button");
	}

	@Then("^user in home page$")
	public void user_in_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Completed");
	}

}
