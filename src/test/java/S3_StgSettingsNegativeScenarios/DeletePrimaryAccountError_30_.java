package S3_StgSettingsNegativeScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;

@Listeners(GenericUtility.ListnersImplementationClass.class)
public class DeletePrimaryAccountError_30_ extends BaseClass {

	@Test(groups = "SettingsNegative3", priority = 30)
	  public void deletePrimaryAccountError() throws Exception
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
			
		   driver.findElement(By.xpath("//a[@href='/settings/addresses']")).click();
			
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//a[text()=' Primary']/following-sibling::button/i[@class='far fa-trash-alt']")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.switchTo().alert().accept();
		   
		   Thread.sleep(3000);
		   
	  }
	
}
