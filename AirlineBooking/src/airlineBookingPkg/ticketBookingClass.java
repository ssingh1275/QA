package airlineBookingPkg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;


public class ticketBookingClass {
	public static void main(String[] args) throws InterruptedException
		{
			System.out.println("Creating Booking Automate");
			System.out.println();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");
			@SuppressWarnings("unused")
			WebDriver driver = new ChromeDriver();
			driver.get("https://spicejet.com");
			
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			//driver.findElement(By.xpath("//a[@value='Hyderabad (HYD)']")).click();
			
			
			Select bs = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
			bs.selectByVisibleText("USD");
			
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
			
			
				}

}