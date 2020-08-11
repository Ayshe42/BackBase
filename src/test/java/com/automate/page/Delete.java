package com.automate.page;

import com.automate.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Delete extends PageBase{
    @FindBy(xpath = "//app-article-meta/div/span[1]/button")
    WebElement delete;
    @FindBy(xpath = "//div[contains(text(), 'No articles')]")
    WebElement deleteInfo;

    public void deleteArticle() {
        delete.click();
    }

    public String getDeletenfo() {
        BrowserUtilities.wait(3);

  return deleteInfo.getText();
}}
