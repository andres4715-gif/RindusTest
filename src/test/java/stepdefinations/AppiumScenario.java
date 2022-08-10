package stepdefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class AppiumScenario {

    private WebDriver driver;

    public AppiumScenario() {
        this.driver = Hook.getDriver();
    }

    @Given("^the user opens the rindus test app$")
    public void the_user_opens_the_rindus_test_app() {

    }

    @When("^the user taps over the first user$")
    public void the_user_taps_over_the_first_user() {

    }

    @Then("^the user can see the user details page$")
    public void the_user_can_see_the_user_details_page() {

    }

    @Then("^he can see his name$")
    public void he_can_see_his_name() throws Throwable {

    }
}
