package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class Action {
    public AppiumDriver driver;
    public TouchAction tac;
    public Actions ac;

    public Action(AppiumDriver driver) {
        this.driver = driver;
        tac = new TouchAction(driver);
        ac = new Actions(driver);
    }


    /**
     * @param by
     */
    public void click(By by) {
        driver.findElement(by).click();
    }

    /**
     * 在元素中间进行点击
     *
     * @param by
     */

    public void tap(By by) {
        tac.tap(driver.findElement(by)).release().perform();
    }

    /**
     * 是否上下滑动
     */

    public void swipe(By startElement, By endElement, boolean Up) {

        Point beginLoc;
        WebElement start = driver.findElement(startElement);
        beginLoc = start.getLocation();
        WebElement end;
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        while (true) {
            try {
                end = driver.findElement(endElement);
                break;
            } catch (Exception e) {
                if (Up) {
                    driver.swipe(beginLoc.getX(), beginLoc.getY(), beginLoc.getX() + 30, beginLoc.getY() + 90, 40);
                } else {
                    driver.swipe(beginLoc.getX(), beginLoc.getY(), beginLoc.getX() - 30, beginLoc.getY() - 90, 40);
                }
            }
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    /**
     * 向左滑动
     * @param source
     */

    public  void categorySwipe(By source){
        WebElement start =driver.findElement(source);
        Point beginLoc=start.getLocation();
        driver.swipe(beginLoc.getX(), beginLoc.getY(), beginLoc.getX() - 700, beginLoc.getY(), 4000);
    }

    public void setValue(By by,String value){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(value);

    }
    public void type(WebElement element,String context){
        element.sendKeys(context);
    }

}