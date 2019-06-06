package com.testcases;

import com.base.BaseTest;
import com.pages.MyListView;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkmenu extends BaseTest {
    @Test(dataProvider = "")
    public void menus(){
        MyListView loginPage =new MyListView(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
   /* @Test
    public void checkmenu() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("美食").click();
        Thread.sleep(3000);
        driver.findElementByName("游玩").click();
        Thread.sleep(3000);
        driver.findElementByName("逛街").click();
        Thread.sleep(3000);
        driver.findElementByName("滑冰").click();
        Thread.sleep(3000);
        driver.findElementByName("摄影").click();
    }*/
