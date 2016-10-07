package TestCases;

import org.testng.annotations.Test;

import Utility.Org;


import org.testng.annotations.BeforeMethod;

//import java.util.Iterator;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddorgNG {
	public static  WebDriver driver;
  @Test(enabled=false)
  public void testdatarm() throws Exception {
	  refLogin.dologin(driver);
	  Org.OrgLink(driver).click();
	  Org.AddOrg(driver).click();
	  Org.Orgname(driver).sendKeys("my first automation org");
	  Thread.sleep(2000);
	  Org.OrgDiscription(driver).sendKeys("Captured: the Man Behind the Crowdfire App - The Ideal Marketing Agency ");
	  Thread.sleep(2000);
	  Org.OrgSave(driver).click();
	  
  }
  @Test(enabled=false)
  public void testdatarmaddpeople() throws Exception {
	  refLogin.dologin(driver);
	  Org.OrgLink(driver).click();
	  Org.AddOrg(driver).click();
	  Org.Orgname(driver).sendKeys("my first automationorg1");
	  Thread.sleep(2000);
	  Org.OrgDiscription(driver).sendKeys("Captured: the Man Behind the Crowdfire App - The Ideal Marketing Agency ");
	  Thread.sleep(2000);
	  Org.OrgAddpeople(driver).sendKeys("acanujchauhan3@gmail.com");
	  Thread.sleep(2000);
	  Org.OrgAddpeoplebtn(driver).click();
	  Thread.sleep(2000);
	  Org.OrgSave(driver).click();
	  
  }
  @Test(enabled=false)
  public void testdatarmaddsite() throws Exception {
	  refLogin.dologin(driver);
	  Org.OrgLink(driver).click();
	  Org.AddOrg(driver).click();
	  Org.Orgname(driver).sendKeys("my first 1");
	  Thread.sleep(2000);
	  Org.OrgDiscription(driver).sendKeys("Captured: the Man Behind the Crowdfire App - The Ideal Marketing Agency ");
	  Thread.sleep(2000);
	  Org.OrgCompanysite(driver).sendKeys("www.facebook.com");
	  Thread.sleep(2000);
	  Org.OrgCompanyadd(driver).click();
	  Thread.sleep(2000);
	  Org.OrgSave(driver).click();
  }
	  @Test(enabled=false)
	  public void testorgcancel() throws Exception {
		  refLogin.dologin(driver);
		  Org.OrgLink(driver).click();
		  Org.AddOrg(driver).click();
		  Org.Orgname(driver).sendKeys("my first 1");
		  Thread.sleep(2000);
		  Org.OrgDiscription(driver).sendKeys("Captured: the Man Behind the Crowdfire App - The Ideal Marketing Agency ");
		  Thread.sleep(2000);
		  Org.OrgCompanysite(driver).sendKeys("www.facebook.com");
		  Thread.sleep(2000);
		  Org.OrgCompanyadd(driver).click();
		  Thread.sleep(2000);
		  Org.OrgCancel(driver).click();
		  
  }
	  @Test
	  public void testImage() throws Exception {
		  refLogin.dologin(driver);
		  Org.OrgLink(driver).click();
		  Org.AddOrg(driver).click();
		  Org.Orgname(driver).sendKeys("my first 48");
		  Thread.sleep(2000);
		  Org.OrgDiscription(driver).sendKeys("Captured: the Man Behind the Crowdfire App - The Ideal Marketing Agency ");
		  Thread.sleep(2000);
		  Org.OrgCompanysite(driver).sendKeys("www.facebook.com");
		  Thread.sleep(2000);
		  Org.OrgCompanyadd(driver).click();
		  Thread.sleep(2000);
		  Org.AddImage(driver).click();
		  Thread.sleep(10000);
		  //Runtime.getRuntime().exec("E:/AutoIT/Upload File.exe");
		  Org.AddImage(driver).sendKeys("C:/Users/anuj/Desktop/Screenshot_1.png");
		  Thread.sleep(4000);
		  Org.OrgSave(driver).click();
		  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.navigate().to("http://test.ravabe.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
