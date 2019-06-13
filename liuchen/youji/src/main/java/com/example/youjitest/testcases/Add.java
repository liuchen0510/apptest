package com.testcases;

import com.base.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add extends BaseTest {
    @Test(dataProvider = "")
    public void attentionpage(){
        AddatentionPage atentionPage=new  AddatentionPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}


    /*@Test
    public void addatention() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElementByName("社区").click();
        driver.findElementById("neet.com.youjidemo:id/image_btn_food").click();
        driver.findElementById("neet.com.youjidemo:id/btn_care").click();
    }*/