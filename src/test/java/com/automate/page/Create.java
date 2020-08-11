package com.automate.page;

import com.automate.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Create extends PageBase {

    @FindBy(xpath = "(//*[@class='nav navbar-nav pull-xs-right']//a)[3]")
    WebElement newPost;
    @FindBy(xpath = "(//input)[1]")
    WebElement articleTitle;
    @FindBy(xpath = "(//input)[2]")
    WebElement whatIsArticleAbout;
    @FindBy(xpath = "//*[@placeholder='Write your article (in markdown)']")
    WebElement writeYourArticle;
    @FindBy(xpath = "(//input)[3]")
    WebElement enterTags;
    @FindBy(xpath = "//button")
    WebElement button;
    String article = "When I get a test case, the first thing " +
            "I do is to analyze the requirements and figure out " +
            "how to test the acceptance criteria in different ways. " +
            "Then, I write manual test cases on Jira and do test executions,";

    public void clickNewPost() {
        BrowserUtilities.wait(4);
        newPost.click();
    }

    public void newPost() {
        wait.until(ExpectedConditions.visibilityOf(articleTitle));
        articleTitle.sendKeys("How to Test Api");
        BrowserUtilities.wait(2);
        wait.until(ExpectedConditions.visibilityOf(whatIsArticleAbout));
        whatIsArticleAbout.sendKeys("Api Testing");
        writeYourArticle.sendKeys(article);
        wait.until(ExpectedConditions.visibilityOf(enterTags));
        enterTags.sendKeys("API");
        button.click();


    }
public String articleTitle(){
    BrowserUtilities.wait(2);
    WebElement title=driver.findElement(By.xpath("//app-article//h1"));
  BrowserUtilities.wait(1);
        return  title.getText();
}



}
