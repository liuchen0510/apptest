package com.testcases;
import com.base.BasePrepare;
import com.pages.ReturnPerCenterPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnPerCenterTest extends BasePrepare {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        ReturnPerCenterPage loginPage =new ReturnPerCenterPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

    /*@Test
    public void personalcenter() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByName("我").click();
        driver.findElementByName("个人中心").click();
        Thread.sleep(5000);
        driver.findElementById("neet.com.youjidemo:id/btn_cancel").click();

    }*/
}
