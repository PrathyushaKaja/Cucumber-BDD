package stepdefinitions;

import io.cucumber.java.en.*;

public class Search {

	@Given("user opens the application")
	public void userOpensApplication() {
		System.out.println(">> User opens the application");
	}

	@When("user enters valid product into search field")
	public void userEntersValidProduct() {
		System.out.println(">> User entered the valid produt in the search field");
	}

	@When("user enters non-existing product into search field")
	public void userEntersNonExistingProduct() {
		System.out.println(">> User entered non-existing product in the search field");
	}

	@When("user don't enter any product into search field")
	public void userDoesNotEnterProduct() {
		System.out.println(">> User didn't enter any product in search field");
	}

	@When("user clicks on search button")
	public void userClicksSearchButton() {
		System.out.println(">> User clicks on the search button");
	}

	@Then("valid product should be displayed in search results")
	public void validProductDisplayed() {
		System.out.println(">> Valid product displayed");
	}

	@Then("proper text informing the user about no product matching should be displayed")
	public void properTextDisplayed() {
		System.out.println(">> Proper text informed the user about no product matching should be displayed");
	}

}
