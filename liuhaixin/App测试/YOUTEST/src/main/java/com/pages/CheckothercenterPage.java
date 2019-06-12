package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckothercenterPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='首页']\"")
    private WebElement txt_title;
    @FindBy(id="neet.com.youjidemo:id/iv_headphoto")
    private WebElement txt_photo;
    @FindBy(xpath = "\"//*[@text='作品']\"")
    private WebElement txt_title1;
    @FindBy(xpath = "\"//*[@text='收藏']\"")
    private WebElement txt_title2;
    @FindBy(xpath = "\"//*[@text='粉丝']\"")
    private WebElement txt_title3;
    Actions action;
    public CheckothercenterPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void cocp() {
        action.click(txt_title);
        action.click(txt_photo);
        action.click(txt_title1);
        action.click(txt_title2);
        action.click(txt_title3);
    }
}
