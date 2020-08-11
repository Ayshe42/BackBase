package com.automate.stepDefinition;

import com.automate.page.Comment;
import com.automate.page.Delete;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteStepDefinitions {
Delete del=new Delete();

    @When("user delete article")
    public void user_delete_article() {
        del.deleteArticle();

    }

    @Then("user see {string}")
    public void user_see(String string) {
        Assert.assertTrue(del.getDeletenfo().contains("No articles"));
    }

}
