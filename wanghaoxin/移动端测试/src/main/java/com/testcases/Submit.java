package com.testcases;

import com.base.BasePrepare;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Submit extends BasePrepare {
    @Test
    public void submit(String a) throws InterruptedException {
        driver.findElementById("neet.com.youjidemo:id/tab_icon").click();
        driver.findElementById("neet.com.youjidemo:id/et_share_passage").clear();
        driver.findElementById("neet.com.youjidemo:id/et_share_passage").sendKeys(a);
        driver.findElementByName("点击增加图片或视频").click();
        driver.findElement(By.className("android.widget.RelativeLayout")).click();
        driver.findElementById("com.google.android.apps.photos:id/image").click();
        driver.findElementByName("上传").click();

}
}
