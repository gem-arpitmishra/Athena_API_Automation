package com.qa.gemini.stepDefinition;

import io.cucumber.java.en.Given;
import com.qa.gemini.commonUtils.commonUtils;
import io.cucumber.java.en.Then;

public class stepDefinition {
    int status;
    @Given("^Set endpoint and method and SampleName \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void Login(String url, String method, String SampleName) throws Exception {
        status = commonUtils.LoginUser(url, method, SampleName, "Login user").getStatus();
    }

    @Then("Verify Status code {int}")
    public void check_status_code(int Expected) {
        commonUtils.VerifyStatusCode(Expected, status);
    }

}
