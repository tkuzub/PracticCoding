package com.practic.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JavaExcelGetDataCell {
    public static void main(String[] args) {
        DataFormatter formatter = new DataFormatter();
        HSSFWorkbook wb = null;
        try (InputStream input = new FileInputStream("src/main/resources/my.xls")) {
            wb = new HSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert wb != null;
        for (Row row : wb.getSheetAt(0)) {
            for (Cell cell : row) {
                CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                System.out.print(cellRef.formatAsString());
                System.out.print(" - ");
                System.out.println(getCellTest(cell));
            }
        }
    }

    private static String getCellTest(Cell cell) {
        String result = "";
        switch (cell.getCellType()) {
            case STRING:
                 result = cell.getRichStringCellValue().getString();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    result = String.valueOf(cell.getDateCellValue());
                } else {
                    result = String.valueOf(cell.getNumericCellValue());
                }
                break;
            case BOOLEAN:
                result = String.valueOf(cell.getBooleanCellValue()) ;
                break;
            case FORMULA:
                result = String.valueOf(cell.getCellFormula());
                break;
            default:
                result = "";
        }
        return result;
    }
}
