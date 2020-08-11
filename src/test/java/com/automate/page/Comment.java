package com.automate.page;

import com.automate.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Comment extends PageBase {

    @FindBy(xpath = "//app-textarea/fieldset/textarea[contains(@placeholder,'Write a comment')]")
    WebElement commentArea;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitComment;
    @FindBy(xpath = "//*[contains(@class,'nav-link')][text()='Your Feed']")
    WebElement yourFeed;
    @FindBy(xpath = "//*[@class='card-text']")
    WebElement yourComment;
    public void writeComment(String comment) {
        BrowserUtilities.wait(4);
        commentArea.sendKeys(comment);
    }

    public void submitComment() {
        BrowserUtilities.wait(2);
        BrowserUtilities.scrollTo(submitComment);
        BrowserUtilities.clickWithJS(submitComment);

    }

    public String getComment(String comment) {
        BrowserUtilities.wait(3);
        BrowserUtilities.scrollTo(yourComment);
        BrowserUtilities.clickWithJS(yourComment);
        BrowserUtilities.wait(4);
        return yourComment.getText();
    }

}
