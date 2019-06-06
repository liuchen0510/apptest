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

public class BasePrepare {
    public AppiumDriver driver;
    public Action action;
    public HomePage homePage;

    @BeforeSuite
    public   void AndroidSettings() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");//设置需要调试模拟器的名字
        capabilities.setCapability("platformVersion", "8.0.0");//设置模拟器的版本

        capabilities.setCapability("appPackage", "neet.com.youjidemo");
        capabilities.setCapability("appActivity", ".MainActivity");
        capabilities.setCapability("unicodeKeyboard", "True"); //支持中文输入
        capabilities.setCapability("resetKeyboard", "True");
        capabilities.setCapability("noReset", true  );//支持中文输入，必须两条都配置
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       // action = new Action(driver);
        action=new Action(driver);
        homePage =new HomePage(driver);
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
    public AndroidDriver getDriver() {
        return (AndroidDriver) this.driver;
    }

    public static String getCfgProperty(String string) {

        return null;
    }
}
