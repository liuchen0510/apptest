package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkothercenter extends BasePrepare {
    @Test
    public void checkothercenter() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByName("首页").click();
        driver.findElementById("neet.com.youjidemo:id/iv_headphoto").click();
        driver.findElementByName("作品").click();
        Thread.sleep(5000);
        driver.findElementByName("收藏").click();
        Thread.sleep(5000);
        driver.findElementByName("粉丝").click();

    }
}