package com.cyb.college.controller;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Excelutil {
    public static void main(String[] args) {
        try {
            HSSFWorkbook myExcelBook = new HSSFWorkbook(
                    new FileInputStream("D:\\CollegeApp\\CollegeApp\\src\\test2.xls"));
            HSSFSheet myExcelSheet = myExcelBook.getSheet("test");
            // HSSFRow row = myExcelSheet.getRow(0);
            int rowCount = myExcelSheet.getLastRowNum() - myExcelSheet.getFirstRowNum();
            for (int i = 13; i < 65; i++) {
                Row row = myExcelSheet.getRow(i);
                String name = row.getCell(5).getStringCellValue();
                double withDraw = row.getCell(6).getNumericCellValue();
                double bal = row.getCell(8).getNumericCellValue();
                String newName = name.replaceAll("[0-9]", "").replace("MPS/", "").replace("BIL/", "")
                        .replace("ATM/", "").replace("NFS/", "").replace("MMT/", "").replace("MPS/", "")
                        .replace("PUBN/", "").replace("IPS/", "").replace("MIN/", "").replace("IIN/", "")
                        .replace("ONL/", "").replace("INFT/", "").replace("SFCNQ/", "").replace("///PUNE", "")
                        .replace("///", "");
                System.out.println("name : " + newName + " || Withdrw :: " + withDraw + " || Balance ::: " + bal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
