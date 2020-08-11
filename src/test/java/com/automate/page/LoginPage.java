package com.automate.page;

import com.automate.utilities.ConfigurationReader;

import java.awt.*;
import java.awt.datatransfer.StringSelection;


public class LoginPage extends PageBase {


    public void login(String basicAuth) {

        String authentication = ConfigurationReader.getProperty(basicAuth);
        driver.get(authentication);

    }

    public String getPageTitle() {
        return driver.getTitle();
    }



}



