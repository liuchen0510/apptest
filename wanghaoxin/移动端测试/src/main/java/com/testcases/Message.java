package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Message extends BasePrepare {
    @Test
    public void message(String a,String b,String c) throws InterruptedException {

        driver.findElementByName("我").click();
        driver.findElementByName("个人中心").click();
        driver.findElementByName("编辑资料").click();
        driver.findElementById("neet.com.youjidemo:id/pde_et_introduction").clear();
        driver.findElementById("neet.com.youjidemo:id/pde_et_introduction").sendKeys(a);
        driver.findElementById("neet.com.youjidemo:id/pde_et_name").sendKeys(b)
        driver.findElementById(" neet.com.youjidemo:id/pde_tv_sex").click();
        driver.findElementByName(c).click();
        driver.findElementByName("完成").click();

}
}
