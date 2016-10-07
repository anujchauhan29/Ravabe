package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Test_Helper;

public class TestAssertion {
	WebDriver driver;
	@Test(enabled=false)
	public void testCaseVerifyHomePage() {
		driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		System.out.println("Page Title::"+driver.getTitle());
		Assert.assertEquals("Googgle", driver.getTitle(),"Title not matching");
		driver.close();
	}
	@Test(enabled=false)
	public void testCaseVerifyHomePageTitle() {
		driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		System.out.println("Page Title::"+driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.close();
	}
	@Test
	public void testCaseVerifyHomePageTtl() throws InterruptedException {
		driver= new FirefoxDriver();
		//driver.navigate().to("http://google.com");
		//Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		Assert.assertTrue(isUserLoggedInSuccessfully(driver), "User failed to login");
		driver.close();
		//Assert.assertFalse(isUserLoggedOut());
	}
	 public boolean isUserLoggedInSuccessfully (WebDriver driver) throws InterruptedException{
		  driver.navigate().to("http://alpha.ravabe.com/");
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Test_Helper.EmailAddress(driver).clear();
	      Test_Helper.EmailAddress(driver).sendKeys("amit@ravabe.com");
		  Test_Helper.LoginPassword(driver).sendKeys("Amit1881");
		  Test_Helper.Login(driver).click();
		  Thread.sleep(5000);
		  System.out.println("Current url::"+driver.getCurrentUrl());
		  Assert.assertEquals("http://alpha.ravabe.com/landing-page", driver.getCurrentUrl());
		  return true;
	 }
}

