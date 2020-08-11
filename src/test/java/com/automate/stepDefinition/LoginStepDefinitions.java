package com.automate.stepDefinition;

import com.automate.page.Bblog;
import com.automate.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    Bblog bblog = new Bblog();

    @Given("user is on the login page logs in given username and password")
    public void user_is_on_the_login_page_logs_in_given_username_and_password() {
        loginPage.login("basicAuth");
    }


    @Then("user see title BBlog")
    public void user_see_title_BBlog() {
        String actualTitle = loginPage.getPageTitle();
        Assert.assertEquals("BBlog", actualTitle);
    }

    @When("user sign in")
    public void user_sign_in() {

        bblog.signIn("username", "password");
    }

    @Then("user able to sign in")
    public void user_able_to_sign_in() {
        Assert.assertFalse(bblog.errorMessage().contains("invalid"));
   //this test fail username box did not accept box it require email
    }

    @When("user sign in with wrong credientials {string} and {string}")
    public void user_sign_in_with_wrong_credientials_and(String string, String string2) {
        bblog.signInInfo(string,string2);
    }

    @Then("user able to see error message")
    public void user_able_to_see_error_message() {
        String error=  bblog.errorMessage();
    Assert.assertTrue(!error.isEmpty());
    }




}