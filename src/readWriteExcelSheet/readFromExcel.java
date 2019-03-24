package readWriteExcelSheet;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class readFromExcel {
	public static void main(String[] args){
		try{
			File file = new File("C:\\Users\\santhosh\\Documents\\selenium softwares\\selenium.xlsx");
		    FileInputStream inputStream = new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook seleniumExcelFile = new XSSFWorkbook(inputStream);
			Sheet mySheet = seleniumExcelFile.getSheet("Sheet1");
			int rowCount = mySheet.getLastRowNum()- mySheet.getFirstRowNum();
			String[] arr = new String[5];
			
			for(int i=0 ;i<=rowCount;i++){ 
				Row row = mySheet.getRow(i);
				arr[i] = row.getCell(0).toString();
				System.out.print(row.getCell(0) + "->" + row.getCell(1) + "--------");
			}
			
			
			//write data
			Row newRow = mySheet.createRow(mySheet.getLastRowNum()+1);
			
			
			
			Cell keralaCity = newRow.createCell(0);
			keralaCity.setCellValue("Kerala");
			
			Cell keralaLoc = newRow.createCell(1);
			keralaLoc.setCellValue("Kochi");
			
			inputStream.close();
			FileOutputStream outputStream = new FileOutputStream(file);
			seleniumExcelFile.write(outputStream);
			outputStream.close();

		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
	
	}

}
