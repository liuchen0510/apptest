package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class LoginPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title;
    @FindBy(id = "neet.com.youjidemo:id/iv_head_sculpture")
    private WebElement txt_personalcenter;
    @FindBy(id = "neet.com.youjidemo:id/et_userPhone")
    private WebElement txt_userphone;
    @FindBy(className = "android.widget.RelativeLayout")
    private WebElement txt_password;
    @FindBy(id = "neet.com.youjidemo:id/btn_login")
    private WebElement btn_submit;


    Actions action;
    public LoginPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void login(String name, String password) {
        action.click(txt_title);

        action.click(txt_personalcenter);
        action.sendKeys(txt_userphone, name);
        action.sendKeys(txt_password, password);
        action.click(btn_submit);
    }
}