package com.testcases;

import com.base.BasePrepare;
import com.pages.CheckMessageCollectionPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMessageCollectionTest extends BasePrepare{
    @Test(dataProvider = "")
    public void cmcps(){
        CheckMessageCollectionPage loginPage =new CheckMessageCollectionPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

        /*@Test
        public void checkmc() throws InterruptedException {
            Thread.sleep(5000);
            driver.findElementByName("消息").click();
            Thread.sleep(5000);
            driver.findElementByName("消息").click();
            driver.findElementByName("点赞/收藏").click();
            Thread.sleep(5000);
            driver.findElementByName("我们之间的距离好像忽远又忽进。").click();
            Thread.sleep(5000);
            driver.findElementByName("点赞/收藏").click();



}*/
}
