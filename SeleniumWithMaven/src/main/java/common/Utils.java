package common;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;


public class Utils {
    public String[][] readExcelFile(String excelFileName, String sheetName) {
        String excelFile = System.getProperty("user.dir") + "/testdata/" + excelFileName;
        String[][] dataTable = null;
        try {
            Workbook workbook = Workbook.getWorkbook(new File(excelFile));
            Sheet sheet = workbook.getSheet(sheetName);
            int rowNum = sheet.getRows();
            int columnNum = sheet.getColumns();

            // Skip header row (row 0)
            dataTable = new String[rowNum - 1][columnNum];

            for (int i = 1; i < rowNum; i++) { // start from row 1
                for (int j = 0; j < columnNum; j++) {
                    dataTable[i - 1][j] = sheet.getCell(j, i).getContents();
                    System.out.println(dataTable[i - 1][j]);
                }
            }

            workbook.close(); // Important: close workbook

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading Excel file: " + e.getMessage(), e);
        }

        return dataTable;
    }
}

