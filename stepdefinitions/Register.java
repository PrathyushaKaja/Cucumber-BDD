package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
    
	@Given("user navigates to register page")
	public void user_navigates_to_register_page() {
		System.out.println(">> User navigated to the register page");
	}

	@When("user enters details in the below fields")
	public void user_enters_details_in_the_below_fields(DataTable datatable) {

		Map<String, String> map = datatable.asMap(String.class, String.class);

		System.out.println("user has entered the first name as:" + map.get("firstname"));
		System.out.println("user has entered the last name as:" + map.get("lastname"));
		System.out.println("user has entered the email address as:" + map.get("emailaddress"));
		System.out.println("user has entered the telephone as:" + map.get("telephone"));
		System.out.println("user has entered the password as:" + map.get("password"));
		System.out.println("user has entered the password confirmation as:" + map.get("passwordconfirm"));
	}

	@And("selects Yes option for the Subscribe field")
	public void selects_Yes_for_the_Subscribe_field() {
		System.out.println(">> User selects the yes option for the subscribe field");
	}

	@And("clicks on Privacy Policy field")
	public void clicks_on_Privacy_Policy_field() {
		System.out.println(">> User clicks on the privacy policy field");
	}

	@Then("clicks on Continue button")
	public void clicks_on_Continue_button() {
		System.out.println(">> User clicks on the continue button");
	}
}
