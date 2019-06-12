package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class ChecktextandsendcommentPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title;
    @FindBy(id="neet.com.youjidemo:id/ib_good")
    private WebElement txt_id1;
    @FindBy(id="neet.com.youjidemo:id/ib_judges")
    private WebElement txt_id2;
    @FindBy(id="neet.com.youjidemo:id/tv_collectNum")
    private WebElement txt_id3;
    @FindBy(xpath = "\"//*[@text='我']\"")
    private WebElement txt_title1;
    @FindBy(id="neet.com.youjidemo:id/comment_content")
    private WebElement txt_id4;
    @FindBy(id="neet.com.youjidemo:id/comment_send")
    private WebElement txt_id5;
    Actions action;
    public ChecktextandsendcommentPage (AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void ctascp(String content) {
        action.click(txt_title);
        action.click(txt_id1);
        action.click(txt_id2);
        action.click(txt_id3);
        action.click(txt_title1);
        action.sendKeys(txt_id5,content);
        action.click(txt_id5);





    }
}
