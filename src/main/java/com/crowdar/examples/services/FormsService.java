package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.FormsConstants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;

public class FormsService {
    public static void checkSuccessModal(){
        MobileActionManager.waitVisibility(FormsConstants.SUCCESS_MODAL_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(FormsConstants.SUCCESS_MODAL_XPATH));
    }
    public static void checkFormsPageVisibility(){
        MobileActionManager.waitVisibility(FormsConstants.FORMS_PAGE_SCREEN_ACCESIBILITY_ID);
        Assert.assertTrue(MobileActionManager.isVisible(FormsConstants.FORMS_PAGE_SCREEN_ACCESIBILITY_ID));
    }
    public static void completeField(String text){
        MobileActionManager.setInput(FormsConstants.TEXT_INPUT_ACCESIBILITY_ID, text);
    }
    public static void clickSwitchButton(){
        MobileActionManager.click(FormsConstants.SWITCH_ACCESIBILITY_ID);
    }
    public static void clickDropDownFirstResult(){
        MobileActionManager.click(FormsConstants.DROPDOWN_ACCESIBILITY_ID);
        MobileActionManager.click(FormsConstants.DROPDOWN_RESULT_XPATH);

    }
    public static void clickActiveButton(){
        //((AndroidDriver)DriverManager.getDriverInstance().getWrappedDriver()).findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Active\").instance(0))").click(); //scroll down to the element and click
        AndroidElement ActiveElement = (AndroidElement) ((AndroidDriver)DriverManager.getDriverInstance().getWrappedDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Active\"))");
        ActiveElement.click();
    }
}
