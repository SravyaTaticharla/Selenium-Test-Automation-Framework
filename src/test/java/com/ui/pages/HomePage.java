package com.ui.pages;

import com.constants.Browser;
import static com.constants.ENV.*;
import com.utility.BrowserUtility;

import static com.utility.JSONUtility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class HomePage extends BrowserUtility {

    private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(), \"Sign in\")]");

    public HomePage(Browser browser, boolean isHeadless) {
        super(browser, isHeadless); // To Call the Parent Class constructor from the child constructor
        goToWebsite(readJson(QA).getUrl());
    }

    public HomePage(WebDriver driver) {
        super(driver); // To Call the Parent Class constructor from the child constructor
        goToWebsite(readJson(QA).getUrl());
    }

    public LoginPage goToLoginPage() {
        clickOn(SIGN_IN_LINK_LOCATOR);
        LoginPage loginPage = new LoginPage(getDriver());
        return loginPage;
    }
}
