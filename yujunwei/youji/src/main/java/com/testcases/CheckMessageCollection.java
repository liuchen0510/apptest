package com.testcases;

import com.base.BasePrepare;
import com.pages.CheckMessageCollectionPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMessageCollectionTest extends BasePrepare{
    @Test(dataProvider = "")
    public void cmcps(){
        CheckMessageCollectionPage loginPage =new CheckMessageCollectionPage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
