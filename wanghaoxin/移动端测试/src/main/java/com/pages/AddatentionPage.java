package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddatentionPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='社区']\"")
    private WebElement txt_title;
  @FindBy(id="neet.com.youjidemo:id/image_btn_food")
    private WebElement txt_food;
  @FindBy(id="neet.com.youjidemo:id/btn_care")
    private WebElement txt_care;
    Actions action;
    public AddatentionPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void atention(String name, String password) {
        action.click(txt_title);
        action.click(txt_food);
        action.click(txt_care);
    }
}
