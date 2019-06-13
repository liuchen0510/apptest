package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class FoodMessagePage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='美食']\"")
    private WebElement txt_title;
    @FindBy(id = "neet.com.youjidemo:id/tv_description")
    private WebElement txt_des;
    @FindBy(id = "neet.com.youjidemo:id/ib_good")
    private WebElement txt_good;
    Actions action;

    public FoodMessagePage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void message() {
        action.click(txt_title);
        action.click(txt_des);
        action.click(txt_good);
    }
}
