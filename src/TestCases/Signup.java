package TestCases;

import java.io.BufferedReader;
import java.io.File;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Utility.Test_Helper;
//import utility.ADD_Events;

public class Signup {
	  
	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
      {
              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //The below method will save the screen shot in d drive with name "screenshot.png"
              FileUtils.copyFile(scrFile, new File("D:\\Screenshots\\SignUp\\" +System.currentTimeMillis()+ ".png"));
      }

	public static void main(String[] args) throws Exception {
		   
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.navigate().to("http://test.ravabe.com/");
	      driver.manage().window().maximize();
	      Test_Helper.Link(driver).click();
	      System.out.print("Would you like to continue(yes/no)::");
	 	  InputStreamReader isr=new InputStreamReader(System.in);
	 	  BufferedReader brd=new BufferedReader(isr);
	 	  String str=brd.readLine();
	 	  while(str.equals("yes")){
	 	  InputStreamReader input= new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(input);
	      System.out.print("Enter Title choice::");
	      String choice=br.readLine();
	 		 switch(choice.toLowerCase()){
	 		 case "1":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 		      Test_Helper.lastName(driver).sendKeys("chauhan");
	 		      Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 		      Test_Helper.Password(driver).sendKeys("Anuj123456");
	 		      Test_Helper.selectTimeZone(driver);
	 		      Test_Helper.acceptTerms(driver).click();
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		 case "2":{
	 			  Test_Helper.firstName(driver).sendKeys("");
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "3":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("");
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "4":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("");
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "5":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.Password(driver).sendKeys("");
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "6":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.Password(driver).sendKeys("Anuj123456");
	 			 Test_Helper.acceptTerms(driver);
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "7":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.Password(driver).sendKeys("Anuj123456");
	 			  Test_Helper.acceptTerms(driver).click();
	 			  Test_Helper.selectTimeZone(driver);
	 		      Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "8":{
	 			  Test_Helper.firstName(driver).sendKeys("");
	 			  Test_Helper.lastName(driver).sendKeys("");
	 			  Test_Helper.Email(driver).sendKeys("");
	 			  Test_Helper.Password(driver).sendKeys("");
	 			  Test_Helper.acceptTerms(driver);
	 			  Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "9":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj");
	 			  Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "10":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.Password(driver).sendKeys("123456");
	 			  Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		}
	 		case "11":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.Password(driver).sendKeys("Anuj123456");
	 			  Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		}
	 		case "12":{
	 			  Test_Helper.firstName(driver).sendKeys("anuj");
	 			  Test_Helper.lastName(driver).sendKeys("chauhan");
	 			  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.Password(driver).sendKeys("Anuj123456");
	 			  Test_Helper.acceptTerms(driver).click();
	 			  Test_Helper.signup(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		}
	 		} 
	 		 System.out.print("Would you like to continue with event::");
	 		 InputStreamReader isrd=new InputStreamReader(System.in);
	 		 BufferedReader brdr=new BufferedReader(isrd);
	 		 str=brdr.readLine();
	 		 if(str.equals("no")){
	 			 System.out.println("ok, thanks");
	 		 }

	 }//End while

	      
	      
	      
	}//End main
}//End class
