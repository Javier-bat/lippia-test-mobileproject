package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import io.appium.java_client.MobileBy;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void checkLoginPageVisibility(){
        MobileActionManager.waitVisibility(LoginConstants.LOGIN_PAGE_SCREEN_ACCESSIBILITY_ID);
        Assert.assertTrue(MobileActionManager.isVisible((LoginConstants.LOGIN_PAGE_SCREEN_ACCESSIBILITY_ID)));
    }
    public static void clickSignUpButton(){
        MobileActionManager.click(LoginConstants.SIGNUP_BUTTON_ACCESSIBILITY_ID);
    }
    public static void completeEmail(String email){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_ACCESSIBILITY_ID,email);
    }
    public static void completePassword(String password){
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_ACCESSIBILITY_ID,password);
    }
    public static void completeConfirmPassword(String password){
        MobileActionManager.setInput(LoginConstants.CONFIRM_PASSWORD_INPUT_ACCESSIBILITY_ID,password);
    }
    public static void clickButtonFinishLogin(){
        MobileActionManager.click(LoginConstants.FINISH_LOGIN_BUTTON_ACCESSIBILITY_ID);
    }
    public static void clickButtonFinishSignup(){
        MobileActionManager.click(LoginConstants.FINISH_SIGNUP_BUTTON_ACCESSIBILITY_ID);

    }
    public static void checkSuccessLogin(){
        MobileActionManager.waitVisibility(LoginConstants.ALERT_TITLE_XPATH);
        MobileActionManager.isVisible(LoginConstants.ALERT_TITLE_XPATH);
    }

}
