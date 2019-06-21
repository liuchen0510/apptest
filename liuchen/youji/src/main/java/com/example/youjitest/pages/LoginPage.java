package com.pages;

import com.utils.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;


public class LoginPage {
    @FindBy(id = "nameET")
    private WebElement name;
    private WebElement name1(){
       return this.driver.findElementById("nameET");
    }

    @FindBy(id = "passwordET")
    private WebElement password;
    @FindBy(className = "android.widget.Button")
     private  WebElement submit;
    @FindAll({@FindBy(id="android:id/title")})
    public List<WebElement> elementList;
    private  WebElement get_name(){
        return driver.findElement(By.id(""));
    }
    AndroidDriver driver;
    Actions action;
    public LoginPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        action=new Actions(driver);
    }
    public void login(String na,String pwd){
          action.type(name,na);
          action.type(password,pwd);
          action.click(submit);
    }
}
