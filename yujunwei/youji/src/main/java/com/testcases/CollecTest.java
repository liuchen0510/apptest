package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.Test;

public class PersonalCenterPageTest extends BaseTest {
    @Test
    public void checkWorks() throws InterruptedException {
        PersonalCenterPage pp=new PersonalCenterPage(getDriver());
        pp.enterPersonalCenter();
        pp.checkWorks();
        pp.exitPersonalCerter();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }