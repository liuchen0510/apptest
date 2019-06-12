package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CommentPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='社区']\"")
    private WebElement txt_title;
    @FindBy(id="neet.com.youjidemo:id/image_btn_food")
    private WebElement txt_food;
    @FindBy(xpath = "\"//*[@text='社区']\"")
    private WebElement txt_shequ;
    @FindBy(id="\"neet.com.youjidemo:id/iv_contentimage\"")
    private WebElement txt_content;
    @FindBy(xpath = "\"//*[@text='点击发表你的评论']\"")
    private WebElement txt_pinglun;
    @FindBy(id="neet.com.youjidemo:id/comment_content")
    private WebElement txt_con ;
    @FindBy(id="neet.com.youjidemo:id/comment_send")
    private WebElement txt_send;
    Actions action;
    public CommentPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void comment(String con) {
        action.click(txt_title);
        action.click(txt_food);
        action.click(txt_shequ);
        action.click(txt_content);
        action.click(txt_pinglun);
        action.sendKeys(txt_con,con);
        action.click(txt_send);
    }


}
