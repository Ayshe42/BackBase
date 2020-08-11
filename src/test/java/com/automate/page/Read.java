package com.automate.page;

import com.automate.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Read extends PageBase{
    @FindBy(xpath = "//span[contains(text(),'Read more')]")
    WebElement readMore;
    @FindBy(xpath = "(//ul/li[2]/a)[1]")
    WebElement userProfile;
    @FindBy(xpath = "//p")
    WebElement text;
    @FindBy(xpath = "app-article/div/div[2]/div[1]/div/div/p/text()")
    WebElement getReadMore;
    @FindBy(xpath = "//a")
   List<WebElement>tags;

    public void clickProfile() {
        userProfile.click();
    }

    public void readArticle() {
        BrowserUtilities.wait(1);
        BrowserUtilities.scrollTo(readMore);
        readMore.click();
    }

    public String getArticle() {
        BrowserUtilities.wait(3);
        String article = text.getText();
        return article;
    }

    public void clickTags() {
        BrowserUtilities.wait(2);
        System.out.println(tags.size()+" size");
        BrowserUtilities.wait(3);
        for(int i=0;i<tags.size();i++) {
            BrowserUtilities.scrollTo(tags.get(i));
            if(tags.get(i).getText().contains("API")){
            BrowserUtilities.wait(3);
            BrowserUtilities.clickWithJS(tags.get(i));
          break;

        }
    }
}}

