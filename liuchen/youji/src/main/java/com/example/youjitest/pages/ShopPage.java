package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class ShopPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='购物']\"")
    private WebElement title;
    @FindBy(id = "neet.com.youjidemo:id/tv_description")
    private WebElement des;
    @FindBy(id = "neet.com.youjidemo:id/ib_good")
    private WebElement good;
    Actions action;

    public ShoppingMessagePage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void shop() {
        action.click(title);
        action.click(des);
        action.click(good);
    }
}
