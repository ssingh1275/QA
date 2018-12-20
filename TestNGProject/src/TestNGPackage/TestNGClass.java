package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.FindBy;

public class TestNGClass {

    WebDriver driver = new FirefoxDriver();

    @FindBy(id="Email")
    private WebElement gmailUserName;

    @FindBy(id="Passwd")
    private WebElement gmailPwd;

    @FindBy(id="SignIn")
    private WebElement logInbtn;

  @Test
  public void gmailLogin() {
      System.setProperty("webdriver.gecko.driver","C:\\Users\\Vivek\\Downloads\\geckodriver-v0.11.1-win32\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      gmailUserName.clear();
      gmailUserName.sendKeys("hkj@gmail.com");

      gmailPwd.clear();
      gmailPwd.sendKeys("password");

      logInbtn.click();
  }
  @BeforeTest
  public void launchapp() {
      System.setProperty("webdriver.geko.driver","C:\\Users\\Vivek\\Downloads\\geckodriver-v0.11.1-win32\\geckodriver.exe");
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

  }

  @AfterTest
  public void afterTest() {
      driver.close();
  }
}