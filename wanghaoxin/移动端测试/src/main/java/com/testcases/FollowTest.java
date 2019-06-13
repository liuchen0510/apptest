package com.testcases;

import com.base.BasePrepare;
import com.pages.Follow;

import org.testng.Assert;
import org.testng.annotations.Test;

import neet.com.youjidemo.bean.Follow;

public class FollowTest extends BasePrepare {
    @Test(dataProvider = "")
    public void Followtest(){
        Follow f=new Follow(getDriver());
        f.follow();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

}
