package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CommentPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='社区']\"")
    private WebElement title;
    @FindBy(id="neet.com.youjidemo:id/image_btn_food")
    private WebElement food;
    @FindBy(xpath = "\"//*[@text='社区']\"")
    private WebElement shequ;
    @FindBy(id="\"neet.com.youjidemo:id/iv_contentimage\"")
    private WebElement content;
    @FindBy(xpath = "\"//*[@text='点击发表你的评论']\"")
    private WebElement pinglun;
    @FindBy(id="neet.com.youjidemo:id/comment_content")
    private WebElement con ;
    @FindBy(id="neet.com.youjidemo:id/comment_send")
    private WebElement send;
    Actions action;
    public CommentPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void comment(String content) {
        action.click(title);
        action.click(food);
        action.click(shequ);
        action.click(content);
        action.click(pinglun);
        action.sendKeys(con,content);
        action.click(send);
    }
}
