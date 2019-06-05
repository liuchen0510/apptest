package com.testcases;

import com.base.BasePrepare;
import com.pages.CheckMessageAtPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMessageAtTest extends BasePrepare {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        CheckMessageAtPage messageAtPage =new CheckMessageAtPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
       /* @Test
        public void checkma() throws InterruptedException {
            Thread.sleep(5000);
            driver.findElementByName("消息").click();
            Thread.sleep(5000);
            driver.findElementByName("消息").click();
            driver.findElementByName("@的消息").click();
            driver.findElementById("neet.com.youjidemo:id/ib_collection").click();

}*/
    }
