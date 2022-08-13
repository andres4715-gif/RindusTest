package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    protected WebDriver driver;

    private String userElement = "//*[@text = 'Leanne Graham']";

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void tapOverUserElement() {
        driver.findElement(By.xpath(userElement)).click();
    }
}