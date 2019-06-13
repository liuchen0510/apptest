package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckmessagePage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='世界这么大你想去看看。']\"")
    private WebElement txt_comment;
    @FindBy(xpath = "\"//*[@text='重新打开应用']\"")
    private WebElement txt_restart;
    Actions action;
    public CheckmessagePage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void login() {
        action.click(txt_title);
        action.click(txt_comment);
        action.click(txt_restart);
    }


}
