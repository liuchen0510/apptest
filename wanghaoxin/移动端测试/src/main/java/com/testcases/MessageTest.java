package com.testcases;

import com.base.BasePrepare;
import com.pages.Message;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MessageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void messagetest(){
        Message m =new Message(getDriver());
        m.message("追星女孩"，"本命张远","女");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());


}
}
