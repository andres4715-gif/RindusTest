package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.Post;
import pages.PostDetails;
import pages.UserDetails;
import pages.Users;
import utility.Hook;
import utility.Utils;


public class CheckPost {

    private WebDriver driver;

    public CheckPost() {
        this.driver = Hook.getDriver();
    }

    String userNameToSelectOfTheList = "Ervin Howell";

    @When("^the user wants to see any post$")
    public void the_user_wants_to_see_any_post() {
        Utils utils = new Utils(driver);

        utils.tapOverAnyElementWithText(userNameToSelectOfTheList);
        utils.waitLabelWithText("Posts");
        utils.tapOverAnyElementWithText("Posts");
    }

    @When("^he choose (.*) of the list$")
    public void he_choose_any_post_of_the_list(String data) {
        Utils utils = new Utils(driver);

        utils.tapOverAnyElementWithText(data);
        utils.waitLabelWithText(data);
        String checkThePostName = utils.getLabelValueFromInputText(data);
        Assert.assertTrue(data.equals(checkThePostName));
    }

    @Then("^the user can see the comment post$")
    public void the_user_can_see_the_comment_post() throws InterruptedException {
        PostDetails postDetails = new PostDetails(driver);
        Utils utils = new Utils(driver);
        Post post = new Post(driver);
        UserDetails userDetails = new UserDetails(driver);
        Users users = new Users(driver);

        boolean checkCommentLabelExist = postDetails.checkCommentLabel();
        Assert.assertTrue(checkCommentLabelExist);
        postDetails.tapOverTheBackButton();
        post.tapOverTheBackButton();
        userDetails.tapOverTheBackButton();
        users.checkUserLabel();
        utils.waitShortTimeToSeeAnyAction(2);
    }
}
