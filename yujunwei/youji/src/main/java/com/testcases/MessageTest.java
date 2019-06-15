package com.testcases;

import com.base.BasePrepare;
import com.pages.ShoppingMessagePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingMessageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void message(){
        ShoppingMessagePage playmessagePagePage =new ShoppingMessagePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
   
     @Test(dataProvider = "")
    public void message(){
        SkateMessagePage playmessagePagePage =new SkateMessagePage(getDriver());
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
