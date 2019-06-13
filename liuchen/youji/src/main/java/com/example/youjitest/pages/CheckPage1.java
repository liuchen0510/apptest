package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckPage1 {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement title1;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement title2;
    @FindBy(xpath = "\"//*[@text='@的消息'\"")
    private WebElement title3;
    @FindBy(id = "neet.com.youjidemo:id/ib_collection")
    private WebElement collection;
    Actions action;

    public CheckPage1(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void check1() {
        action.click(title1);
        action.click(title2);
        action.click(title3);
        action.click(collection);

    }
}
