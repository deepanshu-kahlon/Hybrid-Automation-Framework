package com.deepanshu.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static Object[][] getLoginData() {

        Object[][] data = null;

        try {

            FileInputStream fis =
                    new FileInputStream("testData/LoginData.xlsx");

            workbook = new XSSFWorkbook(fis);

            sheet = workbook.getSheet("Login");

            int rows = sheet.getPhysicalNumberOfRows();

            int cols = sheet.getRow(0).getLastCellNum();

            data = new Object[rows - 1][cols];

            for (int i = 1; i < rows; i++) {

                for (int j = 0; j < cols; j++) {

                    data[i - 1][j] =
                            sheet.getRow(i).getCell(j).toString();

                }
            }

            workbook.close();
            fis.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return data;
    }

}