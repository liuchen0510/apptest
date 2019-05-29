package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addnotes extends BasePrepare {
    @Test
    public void addnotes() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("收藏").click();
        driver.findElementByName("编辑").click();
        driver.findElementById("neet.com.youjidemo:id/list").sendKeys("一片新天地");

}
}
