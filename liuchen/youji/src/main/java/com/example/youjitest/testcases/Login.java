package com.testcases;

import com.base.BaseTest;
import com.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("15732169079","123456");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
    /*public void loginsuccess() throws InterruptedException {
      Thread.sleep(5000);
      driver.findElementByXPath("//*[@text='我']").click();
      Thread.sleep(5000);
      driver.findElementById("neet.com.youjidemo:id/iv_head_sculpture").click();
      Thread.sleep(5000);
      driver.findElementById("neet.com.youjidemo:id/et_userPhone").sendKeys("15732169079");
      driver.findElement(By.className("android.widget.RelativeLayout")).sendKeys("123456");
      driver.findElementById("neet.com.youjidemo:id/btn_login").click();
      Thread.sleep(5000);
}*/
