package com.testcases;

import com.base.BasePrepare;
import com.pages.FoodMessagePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FoodmessageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void message(){
        FoodMessagePage loginPage =new FoodMessagePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    /*@Test
    public void foodm() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("美食").click();
        driver.findElementById("neet.com.youjidemo:id/tv_description").click();
        Thread.sleep(5000);
        driver.findElementById("neet.com.youjidemo:id/ib_good").click();
}*/
}