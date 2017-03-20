package org.softleader.statistics.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;


@Service
public class ReadExcelService {
	
	
	public RealMatrix readExcelToMatrix(File file) throws InvalidFormatException, IOException {
		
		Workbook wb = new XSSFWorkbook(file);
		Sheet sheet = wb.getSheetAt(0);
		
		RealMatrix matrix = new Array2DRowRealMatrix(sheet.getPhysicalNumberOfRows(), sheet.getRow(0).getPhysicalNumberOfCells());
		
		
		
		
		wb.close();
		return matrix;
	}
	
	

}
