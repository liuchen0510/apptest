package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckPage2 {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement title;
    @FindBy(xpath = "\"//*[@text='世界这么大你想去看看。']\"")
    private WebElement text;
    @FindBy(xpath = "\"//*[@text='重新打开应用']\"")
    private WebElement restart;
    Actions action;
    public CheckPage2(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void check2() {
        action.click(title);
        action.click(text);
        action.click(restart);
    }
}
