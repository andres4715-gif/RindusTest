package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Todo_s {

    protected WebDriver driver;

    private String addButton = "//*[@resource-id='es.jaimesuarez.rindustest:id/fab_add_item']";
    private String dataFillInformation = "//*[@text='Type your todo here…']";
    private String createButton = "//*[@text='CREATE']";
    private String newRecordAdded = "(//*[@resource-id='es.jaimesuarez.rindustest:id/tv_todo_title'])[1]";

    // Constructor
    public Todo_s(WebDriver driver) {
        this.driver = driver;
    }

    public void tapOverTheAddButton() {
        driver.findElement(By.xpath(addButton)).click();
    }

    public void clearDataFillInformation() {
        driver.findElement(By.xpath(dataFillInformation)).clear();
    }

    public void inputNewRecord(String newRecord) {
        driver.findElement(By.xpath(dataFillInformation)).sendKeys(newRecord);
    }

    public void tapOverCreateButton() {
        driver.findElement(By.xpath(createButton)).click();
    }

    public String getNewDataAdded() {
        String gettingData = driver.findElement(By.xpath(newRecordAdded)).getText();
        return gettingData;
    }
}
