package TestCases;

import org.testng.annotations.Test;

import Utility.Test_Helper;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RemembermeNG {
	public static WebDriver driver;
  @Test
  public void testinvalidpwd() throws Exception {
   Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
   Test_Helper.LoginPassword(driver).sendKeys("anuj123");
   Test_Helper.Checkbox(driver).click();
   Test_Helper.Login(driver).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.navigate().to("http://test.ravabe.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
