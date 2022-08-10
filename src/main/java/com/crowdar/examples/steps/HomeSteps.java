package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.Given;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @Given("^El usuario esta en la pagina 'home'$")
    public void checkHomePage(){
        HomeService.checkHomePageVisibility();
    }

}
