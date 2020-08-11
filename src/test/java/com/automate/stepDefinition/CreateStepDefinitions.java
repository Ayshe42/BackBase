package com.automate.stepDefinition;

import com.automate.page.Bblog;
import com.automate.page.Create;
import com.automate.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateStepDefinitions {
Bblog bblog=new Bblog();
Create create=new Create();
    @When("user signInWithEmail")
    public void user_signInWithEmail()  {
      bblog.signInWithEmai();

    }

    @Then("user click NewPost")
    public void user_click_NewPost() {

        create.clickNewPost();
    }

    @When("user Publish Article")
    public void user_Publish_Article() {

        create.newPost();
        BrowserUtilities.wait(2);

    }
    @Then("user verify the title")
    public void user_verify_the_title() {
        String expected="How to Test Api";
        BrowserUtilities.wait(5);
        Assert.assertEquals(expected,create.articleTitle());
    }
}
