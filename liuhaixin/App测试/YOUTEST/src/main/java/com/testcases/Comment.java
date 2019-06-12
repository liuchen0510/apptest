package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Comment extends BasePrepare {
    @Test
    public void comment() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByXPath("//*[@text='社区']").click();
        driver.findElementById("neet.com.youjidemo:id/image_btn_food").click();
        driver.findElementByXPath("//*[@text='广场']").click();
        driver.findElementById("neet.com.youjidemo:id/iv_contentimage").click();
        driver.findElementByXPath("//*[@text='点击发表你的评论']").click();

        driver.findElementById("neet.com.youjidemo:id/comment_content").sendKeys(" bug还没找到？ ？ ？ ");
        driver.findElementById(" neet.com.youjidemo:id/comment_send").click();





}
}
