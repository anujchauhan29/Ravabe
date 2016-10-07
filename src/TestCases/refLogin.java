package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Test_Helper;

public class refLogin {
	public static  WebDriver driver;
	public static void main(String args[]){
	refLogin.dologin(driver);
	}
	 public static void dologin (WebDriver driver){
		  driver.navigate().to("http://alpha.ravabe.com/");
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Test_Helper.EmailAddress(driver).clear();
	      Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
		      Test_Helper.LoginPassword(driver).sendKeys("Anuj1234");
		      Test_Helper.Login(driver).click();
		      Test_Helper.publishEnter(driver).click();

	 }
}
