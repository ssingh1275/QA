package HiveAutTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectionDropdownClass extends CreateDealChildClass {

	public void SelectDropdownTest()
	{
		
		Select s = new Select(driver.findElement(By.id("dciContributions")));
		s.selectByIndex(6);
		
		

	}

}
