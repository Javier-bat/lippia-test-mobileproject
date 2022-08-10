package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("^El usuario esta en la pagina 'login'$")
    public void checkHomePage(){
        LoginService.checkLoginPageVisibility();
    }

    @When("^El usuario hace click en el boton 'Login' del footer$")
    public void cliclLoginInFooter() {
        HomeService.goToLogin();
    }

    @When("^El usuario ingresa su correo \"(.*)\" y contraseña \"(.*)\"$")
    public void completeEmailAndPassword(String email, String password) {
        LoginService.completeEmail(email);
        LoginService.completePassword(password);
    }

    @And("El usuario hace click en 'login'")
    public void clickButtonToCompleteLogin() {
        LoginService.clickButtonFinishLogin();
    }

    @Then("Se visualiza un mensaje de login exitoso")
    public void checkAlertSuccessVisibility() {
        LoginService.checkSuccessLogin();
    }

    @And("El usuario hace click en el boton 'Sign up'")
    public void clickSignUpButton() {
        LoginService.clickSignUpButton();
    }

    @And("^El usuario llena el campo para confirmar su contraseña \"(.*)\"$")
    public void confirmPassword(String pass) {
        LoginService.completeConfirmPassword(pass);
    }

    @And("El usuario hace click en boton 'Sign up' para completar el registro")
    public void completeSignUp() {
        LoginService.clickButtonFinishSignup();
    }

    @When("Se visualiza un mensaje de sign up exitoso")
    public void seVisualizaUnMensajeDeSignUpExitoso() {
        LoginService.checkSuccessLogin();
    }
}
