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

    /**
     * method to wait for any label on the current screen when the xpath element have text
     * @param label
     */
    public void waitLabelWithText(String label) {
        String baseSelector = "//*[@text=";
        String dataLabel = "'" + label + "']";
        String baseSelectorAndDataLabel = baseSelector + dataLabel;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(baseSelectorAndDataLabel)));
    }

    /**
     * method to wait for any label on the current screen when the xpath element have resource-id
     * @param labelResourceId
     */
    public void waitLabelWithresource_id(String labelResourceId) {
        String baseSelectorId = "//*[@resource-id=";
        String dataLabelId = "'" + labelResourceId + "']";
        String baseSelectorAndDataLabelId = baseSelectorId + dataLabelId;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(baseSelectorAndDataLabelId)));
    }
}
