package com.crowdar.examples.steps;

import com.crowdar.examples.services.FormsService;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormsSteps {
    @When("^El usuario hace click en el boton 'Forms' del footer$")
    public void cliclFormsInFooter() {
        HomeService.goToForms();
    }


    @Given("El usuario esta en la pagina 'Forms'")
    public void elUsuarioEstaEnLaPaginaForms() {
        FormsService.checkFormsPageVisibility();
    }

    @And("Completa el campo input con \"(.*)\"")
    public void completaElCampoInputConTextoPrueba(String text) {
        FormsService.completeField(text);
    }

    @And("El usuario hace click en el switch")
    public void elUsuarioHaceClickEnElSwitch() {
        FormsService.clickSwitchButton();
    }

    @And("El usuario selecciona el primer campo del dropdown")
    public void elUsuarioSeleccionaElPrimerCampoDelDropdown() {
        FormsService.clickDropDownFirstResult();
    }

    @And("El usuario presiona active terminar el form")
    public void elUsuarioPresionaActiveTerminarElForm() {
        FormsService.clickActiveButton();
    }

    @Then("se visualiza un modal exitoso")
    public void seVisualizaUnModalExitoso() {
        FormsService.checkSuccessModal();
    }
}
