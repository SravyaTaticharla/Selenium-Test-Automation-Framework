package com.utility;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVReaderutility {

    public static Iterator<User> readCSVFile(String fileName) {

        File csvfile = new File(System.getProperty("user.dir") + "//testData//" + fileName);
        FileReader fileReader = null;
        CSVReader csvReader =null;
        String[] line;
        List<User> userList = null;
        User userData;

        try {
            fileReader = new FileReader(csvfile);
            csvReader = new CSVReader(fileReader);
            csvReader.readNext();

           userList = new ArrayList<User>();
            while((line = csvReader.readNext())!= null) {
                userData  = new User(line[0], line[1]);
                userList.add(userData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
        }

        return userList.iterator();

    }
}
