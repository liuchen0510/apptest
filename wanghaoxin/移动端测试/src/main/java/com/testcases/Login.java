package com.testcases;

import com.base.BasePrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BasePrepare {
    @Test
    public void login(String a,String b) throws InterruptedException {
      driver.findElementByXPath("//*[@text='我']").click();
      driver.findElementById("neet.com.youjidemo:id/iv_head_sculpture").click();
      driver.findElementById("neet.com.youjidemo:id/et_userPhone").sendKeys(a);
      driver.findElement(By.className("android.widget.RelativeLayout")).sendKeys(b);
      driver.findElementById("neet.com.youjidemo:id/btn_login").click();
      Thread.sleep(1000);
}
}
