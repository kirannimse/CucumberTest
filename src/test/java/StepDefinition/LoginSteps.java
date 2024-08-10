package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("is on login page")
	public void is_on_login_page() {
		System.out.println("Inside steps- User is on login page");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("User enter username and password");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Inside steps- User click on login button");
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		System.out.println("Inside steps- User is on home page");
	}

}
