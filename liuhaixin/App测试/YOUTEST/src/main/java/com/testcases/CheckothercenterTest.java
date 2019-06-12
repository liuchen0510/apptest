package com.testcases;

import com.base.BasePrepare;
import com.pages.CheckothercenterPage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckothercenterTest extends BasePrepare {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        CheckothercenterPage centerPage =new CheckothercenterPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    /*@Test
    public void checkothercenter() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByName("首页").click();
        driver.findElementById("neet.com.youjidemo:id/iv_headphoto").click();
        driver.findElementByName("作品").click();
        Thread.sleep(5000);
        driver.findElementByName("收藏").click();
        Thread.sleep(5000);
        driver.findElementByName("粉丝").click();

    }*/
}