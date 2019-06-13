package com.testcases;

import com.base.BasePrepare;
import com.pages.Submit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubmitTest extends BasePrepare {
    @Test(dataProvider = "")
    public void submittest(){
        Submit su =new  Submit(getDriver());
        su.submitsuccess("今天周三");
        su.submitfail("今天周三");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
