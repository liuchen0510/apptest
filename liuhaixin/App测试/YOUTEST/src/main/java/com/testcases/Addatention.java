package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addatention extends BasePrepare {
    @Test
    public void addatention() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByName("社区").click();
        driver.findElementById("neet.com.youjidemo:id/image_btn_food").click();
        driver.findElementById("neet.com.youjidemo:id/btn_care").click();

    }
}