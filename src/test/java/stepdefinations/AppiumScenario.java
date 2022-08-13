package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
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
    public void the_user_opens_the_rindus_test_app() throws InterruptedException {

        Utils utils = new Utils(driver);
        Users users = new Users(driver);
        UserDetails userDetails = new UserDetails(driver);
        Todo_s todos = new Todo_s(driver);

        utils.waitLabelWithText("Users");
        utils.waitLabelWithText("Leanne Graham");
        users.tapOverUserElement();
        utils.waitLabelWithText("Leanne Graham");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).isDisplayed());
        userDetails.tappingToChooseAnyOption();
        userDetails.tapOverSeeMore();
        utils.waitLabelWithresource_id("es.jaimesuarez.rindustest:id/fab_add_item");
        todos.tapOverTheAddButton();
        utils.waitLabelWithText("CREATE");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text='CREATE']")).isEnabled());
        todos.clearDataFillInformation();
        todos.inputNewRecord(newDataRecord);
        todos.tapOverCreateButton();
        String data = todos.getNewDataAdded();
        Assert.assertTrue(data.equals(newDataRecord));

        boolean checkCheck = driver.findElement(By.xpath("(//*[@resource-id='es.jaimesuarez.rindustest:id/tv_todo_title'])[1]")).isSelected();
        Assert.assertFalse(checkCheck);
        driver.findElement(By.xpath("(//*[@class='android.widget.CheckBox'])[1]")).click();
        Thread.sleep(2000);

    }

    @When("^the user taps over the first user$")
    public void the_user_taps_over_the_first_user() {

    }

    @Then("^the user can see the user details page$")
    public void the_user_can_see_the_user_details_page() {

    }

    @Then("^he can see his name$")
    public void he_can_see_his_name() {

    }
}
