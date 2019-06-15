package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddcommentPage {
    private AppiumDriver driver;
    @FindBy(id="neet.com.youjidemo:id/tab_icon")
    private WebElement txt_icon;
    @FindBy(id="neet.com.youjidemo:id/et_share_passage")
    private WebElement txt_passage;
    @FindBy(xpath = "\"//*[@text='点击增加图片或视频']\"")
    private WebElement txt_title;
    @FindBy(className="android.widget.RelativeLayout")
    private WebElement txt_layout;
    @FindBy(id="com.google.android.apps.photos:id/image")
    private WebElement txt_image;
    @FindBy(xpath = "\"//*[@text='上传']\"")
    private WebElement txt_shangchuan;
    Actions action;
    public AddcommentPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void addcomment(String text) {
        action.click( txt_icon);
        action.sendKeys(txt_passage,text);
        action.click(txt_title);
        action.click(txt_layout);
        action.click(txt_image);
        action.click(txt_shangchuan);

    }


}
