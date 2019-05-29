package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage{
    private AppiumDriver driver;

    public String my = "//*[@text='�ҵ�']";
    public String food = "//*[@text='��ʳ']";
    @AndroidFindBy(id = "")
    public AndroidElement a1;



    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    public void clickFood(){
        driver.findElement(By.xpath(food)).click();
    }


}