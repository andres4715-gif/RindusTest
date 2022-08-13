package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils {

    protected WebDriver driver;

    // Constructor
    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void waitLabelWithText(String label) {
        String baseSelector = "//*[@text=";
        String dataLabel = "'" + label + "']";
        String baseSelectorAndDataLabel = baseSelector + dataLabel;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(baseSelectorAndDataLabel)));
    }
}
