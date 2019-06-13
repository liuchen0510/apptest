package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.Test;

public class Follow extends BasePrepare {
    @Test
    public void follow() throws InterruptedException {
        driver.findElementByName("首页").click();
        driver.findElementByName("游玩").click();
        driver.findElementById("关注").click();
        Thread.sleep(1000);
}
}
