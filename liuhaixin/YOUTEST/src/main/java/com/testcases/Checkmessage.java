package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkmessage extends BasePrepare {
    @Test
    public void checkmessage() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementByName("消息").click();
        driver.findElementByName("世界这么大你想去看看。").click();
        //此处为bug，无法打开查看完整的消息内容
        driver.findElementByName("重新打开应用").click();


}
}
