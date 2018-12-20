package HiveAutTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;

public class CreateDealClass {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.out.println("Creating New Hive Automation Project");
		System.out.println();
		
		CreateDealChildClass cd= new CreateDealChildClass();
		cd.CreateDealChildFunc();
		System.out.println("This is in Parent Class");
		
		
		
	}

}
