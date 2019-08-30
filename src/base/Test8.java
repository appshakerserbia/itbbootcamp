package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test8 {
	
WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dragan\\Desktop\\SELENIUM\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	File file;
    PeoplePage PP;
    List<String> listFromFile;
    FileInputStream stream;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    
    @Test
    
    public void testApache() throws Exception {
    	
        file = new File("C:\\Users\\Dragan\\Desktop\\POI\\ZavrsniFajl.xlsx");
        
        driver.navigate().to(URLs.PEOPLE_PAGE);
        
         PeoplePage PP= new PeoplePage(driver);
        
        listFromFile = new ArrayList<String>();
        stream = new FileInputStream(file);
        wb = new XSSFWorkbook(stream);
        sheet = wb.getSheetAt(0);
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            listFromFile.add(sheet.getRow(i).getCell(0).getStringCellValue());
        }
        Assert.assertFalse(PP.getPeopleInfo().equals(listFromFile));
    }
    @Test
    public void writingInExcel() throws Exception {
    	
    	 PeoplePage PP= new PeoplePage(driver);
    
        List<String> listOfAllPeople = PP.getPeopleInfo();
        int flag = 0;
        int rowCount = sheet.getLastRowNum();
        Row row;
        Cell cell;
        for (int i = 1; i < listOfAllPeople.size(); i++) {
            for (int j = 0; j < listFromFile.size(); j++) {
                if (listOfAllPeople.get(i).equals(listFromFile.get(j))) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                row = sheet.createRow(++rowCount);
                cell = row.createCell(0);
                cell.setCellValue(listOfAllPeople.get(i));
            } else {
                flag = 0;
            }
        }
        FileOutputStream output = new FileOutputStream(file);
        wb.write(output);
        wb.close();
    }
}