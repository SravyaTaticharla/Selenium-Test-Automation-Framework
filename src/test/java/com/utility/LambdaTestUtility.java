package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class LambdaTestUtility {

    private static final String HUB_URL = "https://hub.lambdatest.com/wd/hub";
    private static ThreadLocal<WebDriver> driverLocal = new ThreadLocal<>();
    private static ThreadLocal<DesiredCapabilities> capabilitiesLocal = new ThreadLocal<>();

    public static WebDriver initializeLambdaTestsession(String browser, String testName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("browserVersion", "127");
        Map<String, Object> ltOptions = new HashMap();
        ltOptions.put("user", "sravya61t");
        ltOptions.put("accessKey", "LT_cAZUdqQ7jxj2PK3gv3N5nA4oPO6H8RIggA3WVcM1wGVTSpY");
        ltOptions.put("build", "Selenium 4");
        ltOptions.put("name", testName);
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("seCdp", true);
        ltOptions.put("selenium_version", "4.23.0");
        capabilities.setCapability("LT:Options", ltOptions);
        capabilitiesLocal.set(capabilities);
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(HUB_URL), capabilitiesLocal.get());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driverLocal.set(driver);

        return driverLocal.get();
    }

    public static void quitSession() {
        if (driverLocal.get() != null) {
            driverLocal.get().quit();
        }
    }
}

