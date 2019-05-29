package com.testcases;

import com.base.BasePrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends BasePrepare {
    @Test
    public void login() throws InterruptedException {
        Thread.sleep(5000);

      driver.findElementByName("我").click();
      driver.findElementById(" neet.com.youjidemo:id/iv_head_sculpture").click();
      Thread.sleep(5000);
      driver.findElementById("neet.com.youjidemo:id/et_userPhone").sendKeys("120331");
      driver.findElement(By.className("android.widget.RelativeLayout")).sendKeys("120331");
      driver.findElementById("neet.com.youjidemo:id/btn_login").click();
}
}
