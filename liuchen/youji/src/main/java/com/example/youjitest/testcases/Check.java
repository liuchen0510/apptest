package com.testcases;

import com.base.BaseTest;
import com.pages.ChecktextandsendcommentPage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check extends BaseTest {
    @Test(dataProvider = "")
    public void ctascps(){
        ChecktextandsendcommentPage checktextandsendcommentPage =new ChecktextandsendcommentPage(getDriver());
        checktextandsendcommentPage.ctascp("bug还没找到！");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

    /*@Test
    public void checktextandsendcomment() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("首页").click();
        driver.findElementById("neet.com.youjidemo:id/ib_good").click();
        driver.findElementById("neet.com.youjidemo:id/ib_judges").click();
        driver.findElementById("neet.com.youjidemo:id/tv_collectNum").click();
        driver.findElementByName("点击发表你的评论").click();
        driver.findElementById("neet.com.youjidemo:id/comment_content").sendKeys(" bug");
        driver.findElementById("neet.com.youjidemo:id/comment_send").click();
    }*/
}