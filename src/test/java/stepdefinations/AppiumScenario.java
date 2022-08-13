package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.Todo_s;
import pages.UserDetails;
import pages.Users;
import utility.Hook;
import utility.Utils;

public class AppiumScenario {

    private WebDriver driver;

    public AppiumScenario() {
        this.driver = Hook.getDriver();
    }

    String newDataRecord = "doctor appointment";

    @Given("^the user opens the rindus test app$")
    public void the_user_opens_the_rindus_test_app() {
        Utils utils = new Utils(driver);
        utils.waitLabelWithText("Users");
        utils.waitLabelWithText("Leanne Graham");
    }

    @When("^the user taps over the first user$")
    public void the_user_taps_over_the_first_user() {
        Users users = new Users(driver);
        users.tapOverUserElement();
    }

    @When("^he adds a new task to do$")
    public void he_adds_a_new_task_to_do() {
        Utils utils = new Utils(driver);
        UserDetails userDetails = new UserDetails(driver);

        utils.waitLabelWithText("Leanne Graham");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).isDisplayed());
        userDetails.tappingToChooseAnyOption();
        userDetails.tapOverSeeMore();
        utils.waitLabelWithresource_id("es.jaimesuarez.rindustest:id/fab_add_item");
    }

    @Then("^the user can see the the new task added$")
    public void the_user_can_see_the_the_new_task_added() {
        Utils utils = new Utils(driver);
        Todo_s todos = new Todo_s(driver);

        todos.tapOverTheAddButton();
        utils.waitLabelWithText("CREATE");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text='CREATE']")).isEnabled());
        todos.clearDataFillInformation();
        todos.inputNewRecord(newDataRecord);
        todos.tapOverCreateButton();
        String data = todos.getNewDataAdded();
        Assert.assertTrue(data.equals(newDataRecord));
        boolean checkCheck = todos.checkNewTaskAddedIsSelected();
        Assert.assertFalse(checkCheck);
        todos.tapsToMarkNewTaskAdded();
    }

    @Then("^he can delete the new task added$")
    public void he_can_delete_the_new_task_added() throws InterruptedException {
        Thread.sleep(2000);

    }
}
