package com.testcases;

import com.base.BasePrepare;
import com.pages.Part;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PartTest extends BasePrepare {
    @Test(dataProvider = "")
    public void parttest(){
        Part p =new Part(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}

