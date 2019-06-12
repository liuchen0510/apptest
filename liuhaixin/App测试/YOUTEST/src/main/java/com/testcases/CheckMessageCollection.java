package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.Test;

public class CheckMessageCollection extends BasePrepare{
        @Test
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



}
}
