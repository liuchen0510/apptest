package com.testcases;

import com.base.BaseTest;
import com.pages.MyListView;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageList extends BaseTest {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        MyListView messagePage =new MyListView(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
       /* @Test
        public void checkma() throws InterruptedException {
            Thread.sleep(3000);
            driver.findElementByName("消息").click();
            Thread.sleep(3000);
            driver.findElementByName("消息").click();
            driver.findElementByName("@的消息").click();
            driver.findElementById("neet.com.youjidemo:id/ib_collection").click();
}*/
}