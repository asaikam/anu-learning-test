package qa.learning.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_StepDefination {

    @Given("user is in Home page")
    public void user_is_in_home_page() {
        System.out.println("********** HomePage ********** ");
    }
    @When("user click on submit button")
    public void user_click_on_submit_button() {
    }
    @Then("sucessful submit to SWAGLABS submit page")
    public void sucessful_submit_to_swaglabs_submit_page() {
    }

}
