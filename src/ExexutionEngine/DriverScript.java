package ExexutionEngine;

import java.io.IOException;

import config.Web_lib;
import utility.ExcelUtils;


public class DriverScript
{
	public static void main(String[]args) throws IOException
	{
		String Path = "E:\\PrachiDocs\\framework_Practise\\inputfile.xlsx";
		
		
		ExcelUtils.setExcelFile(Path, "Actions");
		
		for (int i = 1 ; i < 50; i++)
		{
		String key = ExcelUtils.getCellData(i, 3);
		String param1 = ExcelUtils.getCellData(i, 4);
		String param2 = ExcelUtils.getCellData(i, 5);
		
		System.out.println("keyword===>"+key);
		//System.out.println("keyword"+key);
		//System.out.println("keyword"+key);
		
		}
	}
}
