package TestCases;

import org.testng.annotations.Test;

import Utility.Test_Helper;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginNG {
	public static  WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.navigate().to("http://alpha.ravabe.com/");
	      driver.manage().window().maximize();
	  }

   @Test(priority=5)
	public void testLogin() throws Exception {
   Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
   Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
   Test_Helper.Login(driver).click();
   }
   @Test(priority=0)
   public void blankemail() throws Exception {
	      Test_Helper.EmailAddress(driver).sendKeys("");
	      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
	      Test_Helper.Login(driver).click();
   }
   @Test(priority=1)
   public void invalidemail() throws Exception {
	      Test_Helper.EmailAddress(driver).sendKeys("xyz");
	      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
	      Test_Helper.Login(driver).click();
   }
   @Test(priority=3)
   public void blankpwd() throws Exception {
	      Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
	      Test_Helper.LoginPassword(driver).sendKeys("");
	      Test_Helper.Login(driver).click();
   }
   @Test(priority=4)
   public void invalidpwd() throws Exception {
	      Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
	      Test_Helper.LoginPassword(driver).sendKeys("anuj");
	      Test_Helper.Login(driver).click();
   }
 
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  }


