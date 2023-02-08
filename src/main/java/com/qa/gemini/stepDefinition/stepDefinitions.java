package com.qa.gemini.stepDefinition;

import io.cucumber.java.en.Given;
import com.qa.gemini.commonUtils.utils;
import io.cucumber.java.en.Then;

public class stepDefinitions {
    int status;
    @Given("^Set endpoint and method and SampleName \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void Login(String url, String method, String SampleName) throws Exception {
        status = utils.LoginUser(url, method, SampleName, "Login user").getStatus();
    }

    @Then("Verify Status code {int}")
    public void check_status_code(int Expected) {
        utils.VerifyStatusCode(Expected, status);
    }

    @Given("^Set credential endpoint and method and SampleName \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void LoginWrong(String url, String method, String SampleName) throws Exception {
        status = utils.LoginUser(url, method, SampleName).getStatus();
    }

    @Given("^Set email endpoint and method and samplename (.+) and (.+) and (.+)")
    public void forgot_password(String url, String method, String sampleName) {

    }

    @Given("Authenticate endpoint and method and samplename (.+) and (.+) and (.+)")
    public void resetPassword(String url, String method, String sampleName) {

    }
}
