package com.automate.stepDefinition;

import com.automate.page.Read;
import com.automate.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReadStepDefinitions {
   Read read=new Read();
    @When("user click user profile")
    public void user_click_user_profile()
    {
     read.clickProfile();
    }

    @When("user click read more")
    public void user_click_read_more()
    {
  read.readArticle();
    }

    @Then("user can read the article")
    public void user_can_read_the_article() {
    String actual=read.getArticle();
    String expected="When I get a test case";
     BrowserUtilities.wait(2);
    Assert.assertTrue(actual.contains(expected));

    }
    @When("user click tags")
    public void user_click_tags() {

     read.clickTags();
    }



}
