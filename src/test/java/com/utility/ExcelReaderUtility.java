package com.utility;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class ExcelReaderUtility {

    public static void main (String[] args) {

        File xlsxFile = new File(System.getProperty("user.dir")+"//testData//loginData.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();

    }
}
