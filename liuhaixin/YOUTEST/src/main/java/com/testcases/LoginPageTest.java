package com.testcases;

import com.base.BasePrepare;
import com.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("120331","120331");
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
      driver.findElementById("neet.com.youjidemo:id/et_userPhone").sendKeys("120331");
      driver.findElement(By.className("android.widget.RelativeLayout")).sendKeys("120331");
      driver.findElementById("neet.com.youjidemo:id/btn_login").click();
        Thread.sleep(5000);
}*/

