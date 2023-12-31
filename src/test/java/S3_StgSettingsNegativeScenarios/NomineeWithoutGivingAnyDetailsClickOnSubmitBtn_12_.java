package S3_StgSettingsNegativeScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;

@Listeners(GenericUtility.ListnersImplementationClass.class)
public class NomineeWithoutGivingAnyDetailsClickOnSubmitBtn_12_ extends BaseClass {

	@Test(groups = "SettingsNegative2", priority = 12)
	  public void nomineeWithoutGivingAnyDetailsClickOnSubmit() throws Exception
	  {
		  
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
		   }}
			
		   driver.findElement(By.xpath("//span[.='Settings']")).click();
			
		   driver.findElement(By.xpath("//a[.=' Nominee Details ']")).click();
			
		   Thread.sleep(3000);
			
		   driver.findElement(By.xpath("//a[@routerlink='./add']")).click();
			
		   driver.findElement(By.xpath("//button[.='Submit']")).click();
			
		   driver.findElement(By.xpath("abc")).click();
			
			
			
	  }
	
}
