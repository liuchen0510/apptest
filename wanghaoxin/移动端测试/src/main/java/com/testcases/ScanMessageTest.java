package com.testcases;

import com.base.BasePrepare;
import com.pages.ScanMessage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScanMessageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void ScanMessage(){
        ScanMessage scan=new ScanMessage(getDriver());
        scan.scanMessage();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }

}
