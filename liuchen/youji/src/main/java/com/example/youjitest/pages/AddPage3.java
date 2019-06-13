package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddPage3 {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='收藏']\"")
    private WebElement title;
    @FindBy(xpath = "\"//*[@text='编辑']\"")
    private WebElement edit;
    @FindBy(id = "neet.com.youjidemo:id/list")
    private WebElement list;
    Actions action;
    public AddPage3(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void note(String note) {
        action.click(title);
        action.click(edit);
        action.sendKeys(list, note);

    }
}
