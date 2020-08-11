package com.automate.stepDefinition;

import com.automate.page.Comment;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommentStepDefinitions {
    Comment comment=new Comment();

    @When("user write a comment")
    public void user_write_a_comment() {
     comment.writeComment("comment");
     comment.submitComment();
    }

    @Then("user see the comment")
    public void user_see_the_comment() {
    String actual= comment.getComment("comment");
    String expected="comment" ;
    Assert.assertTrue(expected.contains(actual));
    }




}
