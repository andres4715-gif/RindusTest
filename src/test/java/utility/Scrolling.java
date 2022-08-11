package utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;


public class Scrolling {

    protected WebDriver driver;

    // Constructor
    public Scrolling(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollUp() {
        Dimension dimention = driver.manage().window().getSize();
        int start_x = (int) (dimention.width * 0.5);
        int start_y = (int) (dimention.height * 0.8);

        int end_x = (int) (dimention.width * 0.5);
        int end_y = (int) (dimention.height * 0.2);

        TouchAction touch = new TouchAction((PerformsTouchActions) driver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
    }

    public void scrollDown() {
        Dimension dimention = driver.manage().window().getSize();
        int start_x = (int) (dimention.width * 0.5);
        int start_y = (int) (dimention.height * 0.2);

        int end_x = (int) (dimention.width * 0.5);
        int end_y = (int) (dimention.height * 0.8);

        TouchAction touch = new TouchAction((PerformsTouchActions) driver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
    }
}
