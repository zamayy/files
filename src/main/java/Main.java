import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        zagruzka zagruzka = new zagruzka();
        zagruzka.zagruzit("C:\\Users\\Илья\\IdeaProjects\\fileblin\\src\\numbers.xlsx");
    }
}
