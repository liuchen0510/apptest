package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class FoodPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='美食']\"")
    private WebElement title;
    @FindBy(id = "neet.com.youjidemo:id/tv_description")
    private WebElement des;
    @FindBy(id = "neet.com.youjidemo:id/ib_good")
    private WebElement good;
    Actions action;

    public FoodPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void food() {
        action.click(title);
        action.click(des);
        action.click(good);
    }
}
