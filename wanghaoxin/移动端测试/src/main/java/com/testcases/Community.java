package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Community extends BasePrepare {
    @Test
    public void community(String a ) throws InterruptedException {

        driver.findElementByXPath("//*[@text='社区']").click();
        driver.findElementById("neet.com.youjidemo:id/image_btn_food").click();
        driver.findElementByXPath("//*[@text='广场']").click();
        driver.findElementById("neet.com.youjidemo:id/iv_contentimage").click();
        driver.findElementByXPath("//*[@text='点击发表你的评论']").click();
        driver.findElementById("neet.com.youjidemo:id/comment_content").sendKeys(a);
        driver.findElementById(" neet.com.youjidemo:id/comment_send").click();





}
}
