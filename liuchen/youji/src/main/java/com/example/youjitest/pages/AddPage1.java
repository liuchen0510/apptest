package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddPage1 {
    private AppiumDriver driver;
    @FindBy(name="社区")
    private WebElement title;
    @FindBy(id="neet.com.youjidemo:id/image_btn_food")
    private WebElement food;
    @FindBy(id="neet.com.youjidemo:id/btn_care")
    private WebElement care;
    Actions action;
    public AddPage1(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void add1(String name, String password) {
        action.click(title);
        action.click(food);
        action.click(care);
    }
}
