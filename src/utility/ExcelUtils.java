package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils
{
	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    
    //Set Excel file path and open excel file
    //Pass path and sheet name as variable
    
    public static void setExcelFile(String Path, String SheetName) throws IOException 
    {
    	FileInputStream ExcelFile= new FileInputStream(Path);
    	 ExcelWBook = new XSSFWorkbook(ExcelFile);
    	 ExcelWSheet  = ExcelWBook.getSheet(SheetName);
    
    }
  //This method is to read the test data from the Excel cell
    //In this we are passing parameters/arguments as Row Num and Col Num
    public static String getCellData(int RowNum, int ColNum) throws IOException
    {
    	Cell= ExcelWSheet.getRow(RowNum).getCell(ColNum);
    	String CellData = Cell.getStringCellValue();
    	return CellData;
    	
    }

    
    
}
