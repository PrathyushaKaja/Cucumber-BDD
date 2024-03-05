package stepdefinitions;

import io.cucumber.java.en.*;

public class Login {

	@Given("user navigates to Login page")
	public void user_navigates_to_login_page() {
		System.out.println(">> User navigated to the login page");
	}

	@When("^user enters valid username (.+)$")
	public void userEntersValidUsername(String email) {
		System.out.println(">> User entered valid username: " + email);
	}

	@And("^enters valid password (.+)$")
	public void entersValidPassword(String password) {
		System.out.println(">> User entered valid password: " + password);
	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
		System.out.println(">> User clicks on submit");
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">> User loggedIn successfully");
	}

	@When("user enters invalid username {string}")
	public void user_enters_invalid_username(String string) {
		System.out.println(">> User entered invalid username");
	}

	@When("enters invalid password {string}")
	public void enters_invalid_password(String string) {
		System.out.println(">> User entered invalid password");
	}

	@Then("user should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">> User gets a proper warning message");
	}
}
