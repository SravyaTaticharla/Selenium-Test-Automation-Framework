package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class LoginPage extends BrowserUtility {

    static final By EMAIL_TEXT_BOX_LOCATOR = By.id("email");
    static final By PASSWORD_TEXT_BOX_LOCATOR = By.id("passwd");
    static final By SUBMIT_BUTTON_LOCATOR = By.id("SubmitLogin");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage doLoginWith(String emailAdress, String password) { //Page Funcions -- We cannot use void
        enterText(EMAIL_TEXT_BOX_LOCATOR, emailAdress);
        enterText(PASSWORD_TEXT_BOX_LOCATOR, password);
        clickOn(SUBMIT_BUTTON_LOCATOR);
        MyAccountPage myAccount = new MyAccountPage(getDriver());
        return myAccount;

    }
}
