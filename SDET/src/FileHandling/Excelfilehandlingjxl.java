package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.read.biff.BiffException;

public class Excelfilehandlingjxl 
{
	public void writeExcelData(String path) throws IOException
	{
		File f=new File(path);
		FileInputStream fo=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook();
		XSSFSheet xt=xs.createSheet("Layanav");		
		for(int i=0;i<3;i=i+1)
		{
			XSSFRow xr=xt.createRow(i);
			for(int j=0;j<3;j=j+1)
			{
				XSSFCell sc=xr.createCell(j);
				xc.setCellValue("test");
			}
		}
		xs.write(fo);
		fo.flush();
		fo.close();
	}
	
	
	public void readExcelData(String path) throws IOException
	{
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		int r=xt.getPhysicalNumberOfRows();
		for(int i=0;i<r;i=i+1)
		{
			XSSFRow xr=xt.getRow(i);
					int c=xr.getPhysicalNumberOfCells();
					for(int j=0;j<c;j=j+1);
		
			{	
			XSSFCell xc=xr.getCell(j);
			System.out.println(xc.getStringCellValue());
			
			}
		}
	
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		Excelfilehandling e=new Excelfilehandling();
		e.readExcelData();
	}
}
