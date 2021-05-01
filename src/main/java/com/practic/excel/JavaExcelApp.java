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
        Sheet sheet = wb.createSheet("mySheet");

        String path = "src/main/resources/my.xls";
        File file = new File(path);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            wb.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        file.deleteOnExit();
    }
}
