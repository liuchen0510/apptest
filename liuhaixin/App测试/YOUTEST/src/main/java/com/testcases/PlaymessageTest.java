package com.testcases;

import com.base.BasePrepare;
import com.pages.PlaymessagePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaymessageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void message(){
        PlaymessagePage playmessagePagePage =new PlaymessagePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
   /* @Test
    public void playm() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("游玩").click();
        driver.findElementById("neet.com.youjidemo:id/tv_description").click();
        Thread.sleep(5000);
        driver.findElementById("neet.com.youjidemo:id/ib_good").click();
    }*/
}
