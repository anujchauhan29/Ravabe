package TestCases;

import org.testng.annotations.Test;

import Utility.Test_Helper;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public static  WebDriver driver;
    @Test
	public void testSingup() throws Exception {
		// TODO Auto-generated method stub

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
	 			  Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
	 		      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
	 		      Test_Helper.Login(driver).click();
	 		      
	 		      break; 
	 		 }
	 		 case "2":{
	 			  Test_Helper.EmailAddress(driver).sendKeys("");
	 		      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
	 		      Test_Helper.Login(driver).click();
	 		      Thread.sleep(4000);
	 		      
	 		      break; 
	 		 }
	 		 case "3":{
	 			  Test_Helper.EmailAddress(driver).sendKeys("xyz");
	 		      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
	 		      Test_Helper.Login(driver).click();
	 		      
	 		      break; 
	 		 }
	 		case "4":{
	 			  Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
	 		      Test_Helper.LoginPassword(driver).sendKeys("");
	 		      Test_Helper.Login(driver).click();
	 		     
	 		      break; 
	 		 }
	 		case "5":{
	 			  Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
	 		      Test_Helper.LoginPassword(driver).sendKeys("anuj");
	 		      Test_Helper.Login(driver).click();
	 		      
	 		      break; 
	 		 }
	 		case "6":{
	 			  Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
	 		      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
	 		      Test_Helper.Checkbox(driver).click();
	 		      Test_Helper.Login(driver).click();
	 		      
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
	    } //End while 
	 	  
	 }//End main

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
