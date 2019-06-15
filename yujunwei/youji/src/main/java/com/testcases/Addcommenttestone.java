package com.testcases;

import com.base.BasePrepare;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addcomment extends BasePrepare {
    @Test
    public void addcomment() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementById("neet.com.youjidemo:id/tab_icon").click();
        driver.findElementById("neet.com.youjidemo:id/et_share_passage").clear();
        driver.findElementById("neet.com.youjidemo:id/et_share_passage").sendKeys("123");
        driver.findElementByName("上传").click();

}
}
