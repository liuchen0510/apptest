package com.testcases;

import com.base.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add extends BaseTest {
    @Test(dataProvider = "")
    public void addpage1(){
        AddPage1 Page1=new  AddPage1(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}


    /*@Test
    public void addpage1() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByName("社区").click();
        driver.findElementById("neet.com.youjidemo:id/food").click();
        driver.findElementById("neet.com.youjidemo:id/care").click();
    }*/
