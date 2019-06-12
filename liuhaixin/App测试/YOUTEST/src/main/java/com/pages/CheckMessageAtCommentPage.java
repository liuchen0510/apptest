package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckMessageAtCommentPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement txt_title1;
    @FindBy(xpath = "\"//*[@text='@的消息'\"")
    private WebElement txt_title2;
    Actions action;
    public CheckMessageAtCommentPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void atcomment() {
        action.click(txt_title);
        action.click(txt_title1);
        action.click(txt_title2);
}
}
