package com.testcases;

import com.base.BasePrepare;
import com.pages.CheckMessageCommentPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMessageCommentTest extends BasePrepare{
    @Test(dataProvider = "")
    public void loginSuccessful(){
        CheckMessageCommentPage commentPage =new CheckMessageCommentPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

        /*@Test
        public void checkmc() throws InterruptedException {
            Thread.sleep(5000);
            driver.findElementByName("消息").click();
            Thread.sleep(5000);
            driver.findElementByName("消息").click();
            driver.findElementByName("评论").click();
            Thread.sleep(5000);
            driver.findElementById("neet.com.youjidemo:id/tv_reply_me").click();
            Thread.sleep(5000);
            driver.findElementByName("评论").click();

    }*/
}
