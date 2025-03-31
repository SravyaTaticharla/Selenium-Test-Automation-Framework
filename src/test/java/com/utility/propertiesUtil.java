package com.utility;

import com.constants.ENV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtil {

    public static String readProperty(ENV env, String propertyName) {

        File propFile = new File(System.getProperty("user.dir") + "\\config\\"+env+".properties");
        FileReader fileReader = null;
        Properties properties = new Properties();

        try {
            fileReader = new FileReader(propFile);
            properties.load(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String value = properties.getProperty(propertyName.toUpperCase());
        return value;
    }

}
