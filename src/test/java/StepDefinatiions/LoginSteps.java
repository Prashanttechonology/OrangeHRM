package StepDefinatiions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside Step-user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside step-user enters username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("inside Step-clicks on log in page");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside steps-user is navigated to the home page");
	}



}
