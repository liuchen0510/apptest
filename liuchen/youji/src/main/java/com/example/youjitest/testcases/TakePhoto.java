package com.testcases;

import com.base.BaseTest;
import com.pages.TakePhotosMessagePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TakePhoto extends BaseTest{
    @Test(dataProvider = "")
    public void message(){
        TakePhotosMessagePage playmessagePagePage =new TakePhotosMessagePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    /*@Test
    public void playm() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("摄影").click();
        driver.findElementById("neet.com.youjidemo:id/tv_description").click();
        Thread.sleep(5000);
        driver.findElementById("neet.com.youjidemo:id/ib_good").click();
    }*/
}