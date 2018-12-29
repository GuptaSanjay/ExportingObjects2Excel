package MainClass;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import UserBeans.DeviceDetails;

public class AccessDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	            List<DeviceDetails> list=new ArrayList<DeviceDetails>();
	            DeviceDetails user=new DeviceDetails();
	            DeviceDetails user1=new DeviceDetails(1,"S9","Android","SanjayGupta","8.0.0");
	            DeviceDetails user2=new DeviceDetails(2,"S8","Android","lakshmi","7.0");
	            DeviceDetails user3=new DeviceDetails(3,"7+","iOS","Soni","11.0.0");
	            DeviceDetails user4=new DeviceDetails(4,"Pixel2","Android","SanjayV","9.0");
	            DeviceDetails user5=new DeviceDetails(5,"ipad","iOS","Sathya"," ");
	            list.add(user);
	            list.add(user1);
	            list.add(user2);
	            list.add(user3);
	            list.add(user4);
	            list.add(user5);
	             try
	             {    
	        XSSFWorkbook workbook = new XSSFWorkbook(); 
	              
	        XSSFSheet sheet = workbook.createSheet("TestDevice");// creating a blank sheet
	         int rownum = 0;
	         for (DeviceDetails details : list)
	            {
	        	 Row header = sheet.createRow(0);
	        	    header.createCell(0).setCellValue("S.No");
	        	    header.createCell(1).setCellValue("ModelNumber");
	        	    header.createCell(2).setCellValue("DeviceType");
	        	    header.createCell(3).setCellValue("OwnerName");
	        	    header.createCell(4).setCellValue("OsVersion");
	            Row row = sheet.createRow(rownum++);
	            createList(details, row);
	                
	        }                   
	       
	            FileOutputStream out = new FileOutputStream(new File("TestDeviceDetails.xlsx")); // file name with path
	            workbook.write(out);
	            out.close();
	           
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    
	}
	  private static void createList(DeviceDetails details, Row row) // creating cells for each row
	{
	        
	        Cell cell=row.createCell(0);
	        cell.setCellValue(details.getId());
	     
	        cell = row.createCell(1);
	        cell.setCellValue(details.getModelNumber());
	        
	        cell = row.createCell(2);
	        cell.setCellValue(details.getDeviceType());
	     
	        cell = row.createCell(3);
	        cell.setCellValue(details.getAssigneeName());
	        
	        cell = row.createCell(4);
	        cell.setCellValue(details.getAndroidVersion());
	        
	     System.out.println("Date have been exported successfully");
	       
	    }

}
