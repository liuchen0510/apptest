package com.testcases;

import com.base.BaseTest;
import com.pages.ListPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class List extends BaseTest {
    @Test(dataProvider = "")
    public void list(){
        ListPage list =new ListPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
       /* @Test
        public void list() throws InterruptedException {
            Thread.sleep(3000);
            driver.findElementByName("消息").click();
            Thread.sleep(3000);
            driver.findElementByName("消息").click();
            driver.findElementByName("@的消息").click();
            driver.findElementById("neet.com.youjidemo:id/collection").click();
}*/
}
