package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddnotesPage {
    private AppiumDriver driver;
    @FindBy(xpath = "\"//*[@text='收藏']\"")
    private WebElement txt_title;
    @FindBy(xpath = "\"//*[@text='编辑']\"")
    private WebElement txt_edit;
    @FindBy(id = "neet.com.youjidemo:id/list")
    private WebElement txt_list;
    Actions action;
    public AddnotesPage(AppiumDriver driver) {

        this.driver = driver;
        action = new Actions(driver);
    }
    public void notes(String list) {
        action.click(txt_title);
        action.click(txt_edit);
        action.sendKeys(txt_list, list);

}
}
