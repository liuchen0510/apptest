package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddPage2{
    private AppiumDriver driver;
    @FindBy(id="neet.com.youjidemo:id/tab_icon")
    private WebElementicon;
    @FindBy(id="neet.com.youjidemo:id/et_share_passage")
    private WebElement passage;
    @FindBy(xpath = "\"//*[@text='点击增加图片或视频']\"")
    private WebElement title;
    @FindBy(className="android.widget.RelativeLayout")
    private WebElement layout;
    @FindBy(id="com.google.android.apps.photos:id/image")
    private WebElement image;
    @FindBy(xpath = "\"//*[@text='上传']\"")
    private WebElement upload;
    Actions action;
    public AddcommentPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    public void add2(String text) {
        action.click(icon);
        action.sendKeys(passage,text);
        action.click(title);
        action.click(layout);
        action.click(image);
        action.click(upload);

    }


}
