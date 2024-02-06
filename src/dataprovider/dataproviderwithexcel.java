package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderwithexcel {

			 @DataProvider(name="login")
		public Object[][]sender(){ 
			 Object[][] obj = new Object[2] [2];
			 File file= new File("");
             FileInputStream fis= new FileInputStream(file);
             Workbook wbt= WorkbookFactory.create(fis);
             Sheet sheet = wbt.getSheet("Sheet1");

			 obj[0][0]= sheet.getRow(0).getCell(0).toString();

			 obj[0][1]=sheet.getRow(0).getCell(2).toString();

			 obj[1][0]=sheet.getRow(1).getCell(0).toString();
		     obj[1][1]=sheet.getRow(1).getCell(1).toString();

			 return obj;
		 }

			 @Test (dataProvider ="login")

			 public void receiver(String email, String password) {

			
			driver.get("https://demowebshop.tricentis.com/login");

			 driver.findElement(By.id("Email")).sendKoya (email);

			 driver.findElement(By.id("Password")).sendkeys(password);

			 driver.findElement (By.id("Remember Me")).click();
			 driver.findElement(By.xpath("//input[@value Log an").click());
			 }
			 
			 
		 }

	


