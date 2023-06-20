package commonFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility_Common_Function {
	
	public static void Evidence_File_Creator(String filename, String RequestBody, String ResponseBody) throws IOException
	{
		
		File NewFile = new File("C:\\Users\\ADMIN\\Desktop\\IB\\Git\\Uploads\\New folder\\" + filename + ".txt");
		System.out.println("A new text file created to record request and response of the API" + NewFile.getName());
		
		FileWriter datawrite = new FileWriter(NewFile);
		datawrite.write("request body :" +RequestBody+ "\n\n");
		datawrite.write("response body :" +ResponseBody);
		datawrite.close();
		System.out.println("Request Body and Response Body are saved in : " +NewFile.getName());
		
	}
	
	public static ArrayList<Object> ReadDataExcel(String sheetName, String testCaseName) throws IOException {
	    ArrayList<Object> ArrayData = new ArrayList<Object>();
	    FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\IB\\Git\\Uploads\\New folder\\API_TC3.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    int countofsheet = workbook.getNumberOfSheets();
	    
	    for (int i = 0; i < countofsheet; i++) {
	        String filesheetname = workbook.getSheetName(i);
	        
	        if (filesheetname.equalsIgnoreCase(sheetName)) {
	            XSSFSheet sheet = workbook.getSheetAt(i);
	            Iterator<Row> rows = sheet.iterator();
	            
	            while (rows.hasNext()) {
	            	Row r1=rows.next();
					if (r1.getCell(0).getStringCellValue().equalsIgnoreCase(testCaseName))
					{
						Iterator<Cell> cellvalues=r1.cellIterator();
						while(cellvalues.hasNext())
						{
							Cell cell = cellvalues.next();
						    Object testData;

						    if (cell.getCellType() == CellType.STRING) 
						    {
						        testData = cell.getStringCellValue();
						    } else if (cell.getCellType() == CellType.NUMERIC) 
						    {
						        testData = (int) cell.getNumericCellValue();
						    } else {
						        // Handle other cell types if needed
						        testData = null;
						    }
						   
						    ArrayData.add(testData);
						}
					}
	            }
	        }
	    }
	    
	    workbook.close();
	    return ArrayData;
	}
}
