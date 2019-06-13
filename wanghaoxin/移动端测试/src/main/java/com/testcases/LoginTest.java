package com.testcases;

import com.base.BasePrepare;
import com.pages.Login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePrepare {
    @Test(dataProvider = "")
    public void loginSuccessful(){
        Login login =new Login(getDriver());
        login.login("123456","123456");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals(".MainActivity",getDriver().currentActivity());
    }
}
    
