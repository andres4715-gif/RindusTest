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
import utility.TouchActions;
import utility.Utils;

public class Add_DeleteTaskFlow {

    private WebDriver driver;

    public Add_DeleteTaskFlow() {
        this.driver = Hook.getDriver();
    }

    String newDataRecord = "doctor appointment";
    String userNameToSelectOfTheList = "Ervin Howell";
    String labelToAddNewTask = "CREATE";
    String resourceId = "es.jaimesuarez.rindustest:id/fab_add_item";

    int Xcoordinates;
    int Ycoordinates;

    @Given("^the user opens the rindus test app$")
    public void the_user_opens_the_rindus_test_app() {
        Utils utils = new Utils(driver);
        utils.waitLabelWithText("Users");
        utils.waitLabelWithText("Leanne Graham");
    }

    @When("^the user taps over the first user$")
    public void the_user_taps_over_the_first_user() {
        Utils utils = new Utils(driver);
        utils.tapOverAnyElementWithText(userNameToSelectOfTheList);
    }

    @When("^he adds a new task to do$")
    public void he_adds_a_new_task_to_do() {
        Utils utils = new Utils(driver);
        UserDetails userDetails = new UserDetails(driver);

        utils.waitLabelWithText(userNameToSelectOfTheList);
        Assert.assertTrue(driver.findElement(By.xpath(utils.getElementFromInputText(userNameToSelectOfTheList))).isDisplayed());
        userDetails.tappingToChooseAnyOption();
        userDetails.tapOverSeeMore();
        utils.waitLabelWithresource_id(resourceId);
    }

    @Then("^the user can see the the new task added$")
    public void the_user_can_see_the_the_new_task_added() {
        Utils utils = new Utils(driver);
        Todo_s todos = new Todo_s(driver);

        todos.tapOverTheAddButton();
        utils.waitLabelWithText(labelToAddNewTask);
        Assert.assertTrue(driver.findElement(By.xpath(utils.getElementFromInputText(labelToAddNewTask))).isEnabled());
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
    public void he_can_delete_the_new_task_added() {
        int elementToBeRemoved = 1;

        Todo_s todos = new Todo_s(driver);
        Utils utils = new Utils(driver);

        TouchActions touchActions = new TouchActions(driver);
        Xcoordinates = todos.getCoordenatesIn_x(elementToBeRemoved);
        Ycoordinates = todos.getCoordenatesIn_y(elementToBeRemoved);
        touchActions.swipeAction(Xcoordinates, Ycoordinates, "Right");
        utils.waitLabelWithText("Todo deleted successfully");
        boolean deleteMessage = todos.checkIfDeleteTaskMessage();
        Assert.assertTrue(deleteMessage);

    }

    @Then("^he return to the Users Page$")
    public void he_return_to_the_Users_Page() throws InterruptedException {
        Utils utils = new Utils(driver);
        UserDetails userDetails = new UserDetails(driver);
        Users users = new Users(driver);
        Todo_s todos = new Todo_s(driver);

        todos.tapOverTheBackButton();
        userDetails.tapOverTheBackButton();
        utils.waitLabelWithText("Users");
        boolean checkUserLabel = users.checkUserLabel();
        Assert.assertTrue(checkUserLabel);
        utils.waitShortTimeToSeeAnyAction(2);
    }
}
