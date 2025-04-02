package com.ui.tests;

import com.ui.pages.MyAccountPage;
import com.ui.pojo.AddressPOJO;
import com.utility.FakeAddressUtility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewAddressTest extends TestBase {
    private MyAccountPage myAccountPage;
    private AddressPOJO address;

    @BeforeMethod(description = "Valid First Time user logs into the application")
    public void setup() {
        myAccountPage = homePage.goToLoginPage().doLoginWith("bakomam596@skrak.com", "password");
        address = FakeAddressUtility.getFakeAddress();
    }

    @Test
    public void addNewAddress() {
        String newAddress = myAccountPage.goToAddAddressPage().saveAddress(address);
        Assert.assertEquals(newAddress, address.getAddressAlias().toUpperCase());
    }

}
