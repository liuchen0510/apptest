package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckMessageCollectionPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='消息']\"")
    private WebElement txt_title1;
    @FindBy(xpath = "\"//*[@text='点赞/收藏']\"")
    private WebElement txt_title2;
    @FindBy(xpath = "\"//*[@text='我们之间的距离好像忽远又忽进。']\"")
    private WebElement txt_title3;
    @FindBy(xpath = "\"//*[@text='点赞/收藏']\"")
    private WebElement txt_title4;
    Actions action;
    public CheckMessageCollectionPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void cmcp() {
        action.click(txt_title);
        action.click(txt_title1);
        action.click(txt_title2);
        action.click(txt_title3);
        action.click(txt_title4);
    }
}
