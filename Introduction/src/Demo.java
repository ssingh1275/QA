import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selinium Code
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		//driver.getTitle()
	}

}
