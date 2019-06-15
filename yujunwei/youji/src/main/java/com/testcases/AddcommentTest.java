package com.testcases;

import com.base.BasePrepare;
import com.pages.AddcommentPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
    public void commentTest() throws InterruptedException {
        AddCommentPage ac=new AddCommentPage(getDriver());
        ac.addComment("检测");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
