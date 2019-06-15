package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalcenterTest extends BasePrepare {
@Test
    public void switchCheckTest() throws InterruptedException {
        PersonalCenterPage pp=new PersonalCenterPage(getDriver());
        pp.enterPersonalCenter();
        pp.switchCheck();
        pp.exitPersonalCerter();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
