package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Part extends BasePrepare {
    @Test
    public void part() throws InterruptedException {
        driver.findElementByName("首页").click()
        driver.findElementByName("推荐").click();
        Thread.sleep(5000);
        driver.findElementByName("美食").click();
        Thread.sleep(5000);
        driver.findElementByName("游玩").click();
        Thread.sleep(5000);
        driver.findElementByName("逛街").click();
        Thread.sleep(5000);
        driver.findElementByName("滑冰").click();
        Thread.sleep(5000);
        driver.findElementByName("摄影").click();
    }
}
