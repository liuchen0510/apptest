package com.testcases;

import com.base.BasePrepare;
import com.pages.Community;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommunityTest extends BasePrepare {
    @Test(dataProvider = "")
    public void communitytest(){
        Community com =new Comment(getDriver());
        com.community("hello");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}

