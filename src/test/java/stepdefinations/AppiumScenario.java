package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.HomePage;
import utility.Hook;
import utility.Utils;

public class AppiumScenario {

    private WebDriver driver;

    public AppiumScenario() {
        this.driver = Hook.getDriver();
    }

    @Given("^the user opens the rindus test app$")
    public void the_user_opens_the_rindus_test_app() throws InterruptedException {
        String todo = "doctor appointment";

        Utils utils = new Utils(driver);
        HomePage homePage = new HomePage(driver);

        WebDriverWait wait = new WebDriverWait(driver, 30); // TODO Cuando se quiten todos los wait se puede quitar esta.

        utils.waitLabelWithText("Users");
        utils.waitLabelWithText("Leanne Graham");
        homePage.tapOverUserElement();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text= 'Leanne Graham']")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).isDisplayed());
        driver.findElement(By.xpath("(//*[@class='android.widget.CheckBox'])[1]")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'Todo')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@resource-id='es.jaimesuarez.rindustest:id/fab_add_item']")));
        driver.findElement(By.xpath("//*[@resource-id='es.jaimesuarez.rindustest:id/fab_add_item']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='CREATE']")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text='CREATE']")).isEnabled());

        driver.findElement(By.xpath("//*[@text='Type your todo here…']")).clear();
        driver.findElement(By.xpath("//*[@text='Type your todo here…']")).sendKeys(todo);
        driver.findElement(By.xpath("//*[@text='CREATE']")).click();
        String data =driver.findElement(By.xpath("(//*[@resource-id='es.jaimesuarez.rindustest:id/tv_todo_title'])[1]")).getText();
        Assert.assertTrue(data.equals(todo));
        boolean checkCheck =driver.findElement(By.xpath("(//*[@resource-id='es.jaimesuarez.rindustest:id/tv_todo_title'])[1]")).isSelected();
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
