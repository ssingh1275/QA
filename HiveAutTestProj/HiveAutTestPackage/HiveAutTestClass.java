package HiveAutTestPackage;

import org.apache.commons.codec.EncoderException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Object.wait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.google.common.base.Function;
import org.openqa.selenium.remote.ErrorHandler.createThrowable;
import org.junit.Assert.*;


public class HiveAutTestClass {

	@SuppressWarnings("serial")
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.out.println("Creating New Hive Automation Project");
		System.out.println();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hive-qa.apps.discovery.com/clm/");
		
		//if (Thread.interrupted())  // Clears interrupted status!
		      
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("okta-signin-username")).sendKeys("satvinder_singh@qadci.com");
		driver.findElement(By.id("okta-signin-password")).sendKeys("Monumonu!2");
		
		//System.out.println(username);
		
		driver.findElement(By.id("okta-signin-submit")).click();
		
		Thread.sleep(5000);
		
		if(driver.getTitle().contains("HIVE - Home"))
		    //Pass
		    System.out.println("Page title contains \"HIVE - Home\" ");
		else
		    //Fail
		    System.out.println("Page title doesn't contains \"HIVE - Home\" ");
		
		Thread.sleep(1000);
		  driver.findElement(By.id("inventorySubsystem-menuBarItem_text")).click();
		  
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("nameField")).sendKeys("Cake Boss");
		  driver.findElement(By.id("dijit_form_Button_16_label")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Cake Boss")).click();
		  //Thread.sleep(5000);
		  driver.findElement(By.className("dgrid-cell dgrid-column-0-1 field-name dgrid-focus dgrid-selected ui-state-active")).click();
		  
		  
			    
			}
		  
	}


