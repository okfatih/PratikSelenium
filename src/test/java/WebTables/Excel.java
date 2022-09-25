package WebTables;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
    @Test
    public void test1() throws IOException {

        String filePath = "src/resources/ulkeler.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet("Sayfa1");

        Row row = sheet.getRow(3);

        Cell cell = row.getCell(3);

        System.out.println(cell);
    }
}
