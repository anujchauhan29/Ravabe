package TestCases;

import org.testng.annotations.Test;

import Utility.Test_Helper;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Lostpwd {
	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\Screenshots\\Lostpwd\\" +System.currentTimeMillis()+ ".png"));
    }

  @Test
	public void lostpwd() throws Exception {
		// TODO Auto-generated method stub
    
	     
	      Test_Helper.LostpwdLink(driver).click();
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
	 			  Test_Helper.Lostemail(driver).sendKeys("");
	 			  Test_Helper.submitbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		 case "2":{
	 			  Test_Helper.Lostemail(driver).sendKeys("anuj");
	 			  Test_Helper.submitbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		case "3":{
	 			  Test_Helper.Lostemail(driver).sendKeys("anuj@1234.com");
	 			  Test_Helper.submitbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		case "4":{
	 			  Test_Helper.Lostemail(driver).sendKeys("anuj@ravabe.com");
	 			  Test_Helper.submitbtn(driver).click();
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
	 	   }
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.navigate().to("http://test.ravabe.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
