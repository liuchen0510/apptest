package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class ReturnPerCenterPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='个人中心']\"")
    private WebElement txt_title1;
    @FindBy(id="neet.com.youjidemo:id/btn_cancel")
    private WebElement txt_cancel;
    Actions action;
    public ReturnPerCenterPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void percenter() {
        action.click(txt_title);
        action.click(txt_title1);
        action.click(txt_cancel);
    }

}
