package S3_StgSettingsNegativeScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;

@Listeners(GenericUtility.ListnersImplementationClass.class)
public class AddingBankAccountByGivingNameAccountNum_34_ extends BaseClass {

	@Test(groups = "SettingsNegative4", priority = 34)
	  public void addingBankAccountByGivingNameAccountNum() throws Exception
	  {
		  ExcelFileUtility eUtil = new ExcelFileUtility();
		  String Name = eUtil.readDataFromExcel("Settings", 73, 1);
		  String AccountNo = eUtil.readDataFromExcel("Settings", 74, 1);
		  
		  driver.findElement(By.xpath("//span[.='Schemes']")).click();
			
		  for(;;)
		  {
		  try 
		  {
			 driver.findElement(By.xpath("//span[.='Settings']")).click();
			 break;
		  }
		  catch(Exception e)
		  {
			 Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
		   }
		  }
			
		   driver.findElement(By.xpath("//span[.='Settings']")).click();
		   
		   driver.findElement(By.xpath("//a[@routerlink='/settings/bankAccounts']")).click();
	       
		   driver.findElement(By.xpath("//a[@routerlink='./add']")).click();
		   
		   driver.findElement(By.xpath("//input[@formcontrolname='name_on_account']")).sendKeys(Name);
		   
		   driver.findElement(By.xpath("//input[@placeholder='Enter Account Number']")).sendKeys(AccountNo);
		   
         driver.findElement(By.xpath("//button[.='Submit']")).click();
		   
		   driver.findElement(By.xpath("a")).click();
		   
		   
	  }
	
}
