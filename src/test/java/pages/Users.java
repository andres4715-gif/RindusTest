package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Users {

    protected WebDriver driver;

    private String userElement = "//*[@text = 'Leanne Graham']";
    private String usersLabel = "//*[@text='Users']";

    // Constructor
    public Users(WebDriver driver) {
        this.driver = driver;
    }

    public void tapOverUserElement() {
        driver.findElement(By.xpath(userElement)).click();
    }

    public boolean checkUserLabel() {
        boolean userLabel = driver.findElement(By.xpath(usersLabel)).isDisplayed();
        System.out.println("user label is preset: " + userLabel);
        return userLabel;
    }
}
