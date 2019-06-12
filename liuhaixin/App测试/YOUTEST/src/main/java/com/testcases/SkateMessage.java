package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.Test;

public class SkateMessage extends BasePrepare {
    @Test
    public void playm() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("滑冰").click();
        driver.findElementById("neet.com.youjidemo:id/tv_description").click();
        Thread.sleep(5000);
        driver.findElementById("neet.com.youjidemo:id/ib_good").click();
    }
}
