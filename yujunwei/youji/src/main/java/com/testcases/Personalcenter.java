package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Personalcenter extends BasePrepare {
    @Test
    public void personalcenter() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByName("我").click();
        driver.findElementByName("个人中心").click();
        driver.findElementByName("编辑资料").click();
        driver.findElementById("neet.com.youjidemo:id/pde_et_introduction").clear();
        driver.findElementById("neet.com.youjidemo:id/pde_et_introduction").sendKeys("123");
        driver.findElementById("neet.com.youjidemo:id/pde_et_name").clear();
        driver.findElementById("neet.com.youjidemo:id/pde_et_name").sendKeys("于俊伟");

        driver.findElementById(" neet.com.youjidemo:id/pde_tv_sex").click();
        driver.findElementByName("女").click();
        driver.findElementByName("完成").click();
        //driver.findElementById("neet.com.youjidemo:id/pde_rl_hometown").clear();
        //driver.findElementById("neet.com.youjidemo:id/pde_rl_hometown").sendKeys();





}
}
