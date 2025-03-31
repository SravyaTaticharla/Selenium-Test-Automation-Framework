package com.ui.tests;

import com.ui.dataProviders.LoginDataProvider;
import com.ui.pages.HomePage;
import static org.testng.Assert.*;

import com.ui.pojo.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import static com.constants.Browser.*;

@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest extends TestBase {

    @Test(description = "verify user able to login with valid credentials", groups = {"e2e", "sanity"}, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class,
    dataProvider = "LoginTestDataProvider", retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
    public void loginTest (User user) {
        assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test Test");
    }

        @Test(description = "verify user able to login with valid credentials", groups = {"e2e", "sanity"}, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class,
                dataProvider = "LoginTestCSVDataProvider")
        public void loginCSVTest (User user) {
            assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test Test");


        }
}
