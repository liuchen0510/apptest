package com.testcases;

import com.base.BasePrepare;
import com.pages.FoodMessagePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FoodmessageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void message(){
        FoodMessagePage loginPage =new FoodMessagePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

}
