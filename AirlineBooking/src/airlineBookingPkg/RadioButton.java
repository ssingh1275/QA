package airlineBookingPkg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

public static void main(String[] args) {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

driver.get("http://www.echoecho.com/htmlforms10.htm");

int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
System.out.println(count);

for(int i=0; i<count; i++)
	{
		String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		//System.out.println(text);
		if(text.equals("cheese"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();
		}
		
		else
			System.out.println("Oops!!! who got the cheese");
	}
}
	

}



