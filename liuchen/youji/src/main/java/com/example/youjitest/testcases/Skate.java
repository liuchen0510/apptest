package com.testcases;

import com.base.BaseTest;
import com.pages.SkatePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skate extends BaseTest {
    @Test(dataProvider = "")
    public void skate(){
        SkatePage skate =new SkatePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    /*@Test
    public void skate() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("滑冰").click();
        driver.findElementById("neet.com.youjidemo:id/des").click();
        Thread.sleep(3000);
        driver.findElementById("neet.com.youjidemo:id/good").click();
    }*/
}
