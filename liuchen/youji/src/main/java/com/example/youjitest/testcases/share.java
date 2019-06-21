package com.testcases;

import com.base.BaseTest;
import com.pages.ShareActivity;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class share extends BaseTest {
    @Test(dataProvider = "")
    public void share(){
        Share share=new  Share(getDriver());
        add.notes("my first share!");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    /*@Test
    public void share() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("收藏").click();
        driver.findElementByName("编辑").click();
        driver.findElementById("neet.com.youjidemo:id/list").sendKeys("my first share!");
}*/
}
}
