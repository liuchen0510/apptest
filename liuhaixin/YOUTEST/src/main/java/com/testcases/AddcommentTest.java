package com.testcases;

import com.base.BasePrepare;
import com.pages.AddcommentPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddcommentTest extends BasePrepare {
    @Test(dataProvider = "")
    public void comment(){
        AddcommentPage acomPage =new  AddcommentPage(getDriver());
        acomPage.addcomment("美好的一天");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
