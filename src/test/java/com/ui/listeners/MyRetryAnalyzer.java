package com.ui.listeners;

import com.constants.ENV;
import com.utility.JSONUtility;
import com.utility.propertiesUtil;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{

//    private static final int MAX_NUMBER_OF_ATTEMPTS = Integer.parseInt(propertiesUtil.readProperty(ENV.DEV, "MAX_NUMBER_OF_ATTEMPTS"));
    private static final int MAX_NUMBER_OF_ATTEMPTS = JSONUtility.readJson(ENV.QA).getMAX_NUMBER_OF_ATTEMPTS();

    private static int currentAttempt =1;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(currentAttempt <= MAX_NUMBER_OF_ATTEMPTS){
            currentAttempt++;
            return true;
        }
        return false;
    }
}
