package com.testcases;
import com.base.BasePrepare;

import org.testng.annotations.Test;

public class Listory extends BasePrepare {
    @Test
    public void listory() throws InterruptedException {
        driver.findElementByName("我").click();
        driver.findElementByName("足迹").click();
        Thread.sleep(1000);

    }
}
