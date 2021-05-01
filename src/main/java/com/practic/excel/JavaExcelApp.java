package com.practic.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcelApp {
    public static void main(String[] args) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet1 = wb.createSheet("book");
        Sheet sheet2 = wb.createSheet("author");
        Sheet sheet3 = wb.createSheet("publisher");

        File file = new File("src/main/resources/my.xls");

        if (!file.exists()) {
            createNewExcelFile(wb, file);
        }
//        file.deleteOnExit();
    }

    private static void createNewExcelFile(Workbook wb, File file) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            wb.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
