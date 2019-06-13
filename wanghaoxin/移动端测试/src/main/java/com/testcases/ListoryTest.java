package com.testcases;
import com.base.BasePrepare;
import com.pages.Listory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListoryTest extends BasePrepare {
    @Test(dataProvider = "")
    public void test(){
        Listory l =new Listory(getDriver());
        l.listory();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }


}
