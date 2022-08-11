package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utility.Hook;
import utility.Scrolling;

public class AppiumScenario {

    private WebDriver driver;

    public AppiumScenario() {
        this.driver = Hook.getDriver();
    }

    @Given("^the user opens the rindus test app$")
    public void the_user_opens_the_rindus_test_app() {

    }

    @When("^the user taps over the first user$")
    public void the_user_taps_over_the_first_user() throws InterruptedException {

        String data = driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).getText();
        boolean checkStautus = driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).isDisplayed();
        System.out.println("The element is displayed: " + checkStautus);
        System.out.println("the data is: " + data);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).isDisplayed());
        driver.findElement(By.xpath("//*[@text = 'Leanne Graham']")).click();
        String userName = driver.findElement(By.id("es.jaimesuarez.rindustest:id/tv_userDetail_name")).getText();
        System.out.println("El nombre en la segunda pantalla es: " + userName);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("es.jaimesuarez.rindustest:id/tv_userDetail_name")));
        driver.findElement(By.xpath("(//*[@text='See more'])[2]")).click();
        Thread.sleep(1000);
        Scrolling scrolling = new Scrolling(driver);
        scrolling.scrollUp();
        scrolling.scrollDown();
        Thread.sleep(1000);
    }

    @Then("^the user can see the user details page$")
    public void the_user_can_see_the_user_details_page() {

    }

    @Then("^he can see his name$")
    public void he_can_see_his_name() {

    }
}
