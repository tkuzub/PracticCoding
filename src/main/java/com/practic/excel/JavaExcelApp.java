package com.practic.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcelApp {
    public static void main(String[] args) {
        File file = new File("src/main/resources/my.xls");
        Workbook wb = new HSSFWorkbook();

        Sheet sheet1 = wb.createSheet("book");
        Sheet sheet2 = wb.createSheet("author");
        Sheet sheet3 = wb.createSheet("publisher");

        Row row1 = sheet1.createRow(0);
        Cell cell1 = row1.createCell(1);
        cell1.setCellValue("Metro2033");

        if (file.exists()) {
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
