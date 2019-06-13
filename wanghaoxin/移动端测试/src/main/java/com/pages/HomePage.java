package com.pages;

import io.appium.java_client.AppiumDriver;

/**
 * Created by think on 2017/3/13.
 */

public class HomePage {
    private AppiumDriver driver;
    public String my="//*[@test='我的']";

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }
}
