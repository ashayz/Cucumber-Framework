package stepdefinitions;

import config.EnvironmentManager;
import driver.DriverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.action.APIPageLogic;

public class APIStepDefinitions {
    APIPageLogic apiPageLogic = new APIPageLogic(DriverFactory.getDriver());

    @Given("Initialize Base URI with {string}")
    public void initializeBaseURIWith(String baseURL) {
        apiPageLogic.initializeBaseURIWith(baseURL);
    }


    @Then("Verify that endpoint {string} gets {int} respose")
    public void verifyThatEndpointGetsRespose(String endPoint, int statusCode) {
        apiPageLogic.verifyThatEndpointGetsRespose(endPoint,statusCode);
    }
}
