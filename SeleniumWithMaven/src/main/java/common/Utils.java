package common;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;


public class Utils {
    public String[][] readExelFile(String excelFileName, String sheetName) {
        String excelFile = System.getProperty("user.dir") + "/testdata/" + excelFileName;
        String[][] dataTable = null;
        try {
            Workbook workbook = Workbook.getWorkbook(new File(excelFile));
            Sheet sheet = workbook.getSheet(sheetName);
            int rowNum = sheet.getRows();
            int columnNum = sheet.getColumns();
            dataTable = new String[rowNum - 1][columnNum];
            //int i, j=0;
            for (int i = 1; i < rowNum - 1; i++) {
                for (int j = 0; j < columnNum - 1; j++) {
                    dataTable[i][j] = sheet.getCell(j, i).getContents();
                }
            }
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Data not found" + e);
        }
        return dataTable;
    }
}
