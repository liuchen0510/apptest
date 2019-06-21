package com.testcases;

import com.base.BasePrepare;
import com.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("15226583265","123456");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
    /*public void loginsuccess() throws InterruptedException {
      Thread.sleep(3000);
      driver.findElementByXPath("//*[@text='我']").click();
      Thread.sleep(3000);
      driver.findElementById("neet.com.youjidemo:id/sculpture").click();
      Thread.sleep(3000);
      driver.findElementById("neet.com.youjidemo:id/userPhone").sendKeys("15226583265");
      driver.findElement(By.className("android.widget.RelativeLayout")).sendKeys("123456");
      driver.findElementById("neet.com.youjidemo:id/login").click();
      Thread.sleep(3000);
}*/
