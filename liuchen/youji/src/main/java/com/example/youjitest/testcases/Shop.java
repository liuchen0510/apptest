package com.testcases;

import com.base.BaseTest;
import com.pages.ShopePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Shop extends BaseTest {
    @Test(dataProvider = "")
    public void shop(){
        ShopPage shop =new ShopPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
   /* @Test
    public void shop() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("逛街").click();
        driver.findElementById("neet.com.youjidemo:id/des").click();
        Thread.sleep(3000);
        driver.findElementById("neet.com.youjidemo:id/good").click();
    }*/
}
