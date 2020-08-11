package com.automate.page;

import com.automate.utilities.BrowserUtilities;
import com.automate.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bblog extends PageBase {

    @FindBy(xpath = "//app-navbar/nav/div/ul/li[2]/a")
    WebElement signIn;
    @FindBy(xpath = "//app-root")
    WebElement root1;
    @FindBy(xpath = "//*[text()='Need an account?']")
    WebElement needAccount;
    @FindBy(xpath = "//*[text()='Have an account?']")
    WebElement haveAccount;
    @FindBy(xpath = "//nav/div/ul/li[3]/a")
    WebElement signUp;
    @FindBy(xpath = "(//input)[1]")
    WebElement userName;
    @FindBy(xpath = "//*[@placeholder='Email']")
    WebElement userEmail;
    @FindBy(xpath = "(//input)[2]")
    WebElement userpassword;
    @FindBy(xpath = "//button")
    WebElement button;
    @FindBy(xpath = "//*[text()=' email or password is invalid ']")
    WebElement error;


public void signInWithEmai(){
    signIn.click();

    String password = "User123";
    String email = "aysegolcu42@gmail.com";

    userName.sendKeys(email);
    BrowserUtilities.wait(2);
    userpassword.sendKeys(password);
    BrowserUtilities.wait(2);
    button.click();
}
   public void signIn(String username,String password){
  //signIn has username and password input
 //signIn didnot accept username only accept email
 //it gives error message
       String username1 = ConfigurationReader.getProperty(username);
       String password1 = ConfigurationReader.getProperty(password);
       signIn.click();
       userName.sendKeys(username1);
       userpassword.sendKeys(password1);
       button.click();
   }
   public String errorMessage(){
       return error.getText();
   }


    public void signInInfo(String username,String password){
        //signIn has username and password input
        //it gives error message
        signIn.click();
        userName.sendKeys(username);
        userpassword.sendKeys(password);
        button.click();
    }}
