
package HivePackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiveClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.out.println("Hello World");
									
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://hive-qa.apps.discovery.com/clm/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("satvinder_singh@qadci.com");
			//System.out.println("Username");
			driver.findElement(By.id("okta-signin-password")).sendKeys("Monumonu!2");
			driver.findElement(By.id("okta-signin-submit")).click();
			
			Thread.sleep(5000);
			boolean Title=driver.getTitle().contains("HIVE - Home");
		    System.out.println(Title);
		    
   
	}
	
}
	
