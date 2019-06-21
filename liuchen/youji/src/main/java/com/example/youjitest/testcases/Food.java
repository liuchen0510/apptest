package com.testcases;

import com.base.BaseTest;
import com.pages.FoodPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Food extends BaseTest {
    @Test(dataProvider = "")
    public void food(){
        FoodPage food =new FoodPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
    /*@Test
    public void food() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("美食").click();
        driver.findElementById("neet.com.youjidemo:id/description").click();
        Thread.sleep(3000);
        driver.findElementById("neet.com.youjidemo:id/good").click();
}*/
}
