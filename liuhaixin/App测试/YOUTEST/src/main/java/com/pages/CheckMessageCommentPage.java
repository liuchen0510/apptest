package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckMessageCommentPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title1;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title2;
    @FindBy(id="neet.com.youjidemo:id/tv_reply_me")
    private WebElement txt_me;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title3;
    Actions action;
    public CheckMessageCommentPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void cmcmmp() {
        action.click(txt_title);
        action.click(txt_title1);
        action.click(txt_title2);
        action.click(txt_me);
        action.click(txt_title3);

    }
}
