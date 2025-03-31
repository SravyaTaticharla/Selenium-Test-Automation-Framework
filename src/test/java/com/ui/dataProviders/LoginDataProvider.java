package com.ui.dataProviders;

import com.google.gson.Gson;
import com.ui.pojo.TestData;
import com.ui.pojo.User;
import com.utility.CSVReaderutility;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LoginDataProvider {

    @DataProvider(name = "LoginTestDataProvider")
    public Iterator<Object[]> logindataProvider() {
        Gson gson = new Gson();
        File testDatafile = new File(System.getProperty("user.dir") + "\\testData\\loginData.json");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(testDatafile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        TestData data = gson.fromJson(fileReader, TestData.class); // It will return object
        List<Object[]> dataToReturn = new ArrayList<Object[]>();

        for (User user : data.getData()) {
            dataToReturn.add(new Object[]{user});
        }
        return dataToReturn.iterator();
    }

    @DataProvider(name= "LoginTestCSVDataProvider")
    public Iterator<User> loginCSVDataProvider() {
        return CSVReaderutility.readCSVFile("loginData.csv");
    }
    }



