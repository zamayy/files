import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class zagruzka {
    public void zagruzit(String file) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);
        String vivod = cell.getStringCellValue();
        FileWriter out = new FileWriter("C:\\Users\\Илья\\IdeaProjects\\fileblin\\src\\numbers.txt");
        out.write(vivod);
        out.flush();
    }
}
