package com.testcases;

import com.base.BaseTest;
import com.pages.ChecktextandsendcommentPage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check extends BaseTest {
    @Test(dataProvider = "")
    public void check(){
        ChecktPage1 check1 =new CheckPage1(getDriver());
        check1.check1("bug未找到！");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

    /*@Test
    public void check() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("首页").click();
        driver.findElementById("neet.com.youjidemo:id/good").click();
        driver.findElementById("neet.com.youjidemo:id/judges").click();
        driver.findElementById("neet.com.youjidemo:id/collection").click();
        driver.findElementByName("点击发表你的评论").click();
        driver.findElementById("neet.com.youjidemo:id/content").sendKeys("bug");
        driver.findElementById("neet.com.youjidemo:id/send").click();
    }*/
}
