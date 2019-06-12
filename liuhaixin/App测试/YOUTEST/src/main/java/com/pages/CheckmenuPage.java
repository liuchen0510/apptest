package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CheckmenuPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='美食']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='逛街']\"")
    private WebElement txt_title1;
    @FindBy(xpath = "\"//*[@text='游玩']\"")
    private WebElement txt_title2;
    @FindBy(xpath = "\"//*[@text='滑冰']\"")
    private WebElement txt_title3;
    @FindBy(xpath = "\"//*[@text='摄影']\"")
    private WebElement txt_title4;
    Actions action;
    public CheckmenuPage(AppiumDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }
    public void menu(){
        action.click(txt_title);
        action.click(txt_title1);
        action.click(txt_title2);
        action.click(txt_title3);
        action.click(txt_title4);

    }



}
