package com.base;

import com.pages.HomePage;
import com.utils.Action;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
public class BaseTest {
      public AppiumDriver driver;
    public Action action;
    public HomePage homePage;

    @BeforeSuite
    public   void AndroidSettings() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("apps", app.getAbsolutePath());
        capabilities.setCapability("noReset",true);//保留历史数据
        capabilities.setCapability("appPackage", "me.tictok.linear");
        capabilities.setCapability("appActivity", ".WelcomeActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

       // action = new Action(driver);
        action=new Action(driver);
        homePage =new HomePage(driver);
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}