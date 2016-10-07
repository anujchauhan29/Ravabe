package TestCases;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Test_Helper;

public class reset_pwd {
	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\Screenshots\\resetpwd\\" +System.currentTimeMillis()+ ".png"));
    }


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.navigate().to("http://test.ravabe.com/");
	      driver.manage().window().maximize();
	      Test_Helper.LostpwdLink(driver).click();
	      Test_Helper.Lostemail(driver).sendKeys("anuj@ravabe.com");
	      Test_Helper.submitbtn(driver).click();
	      driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	      Test_Helper.gmailemail(driver).sendKeys("anuj@ravabe.com");
	      Test_Helper.gmailbtn(driver).click();
	      Test_Helper.gmailpwd(driver).sendKeys("anujchauhan");
	      Test_Helper.signin(driver).click();
	      Test_Helper.emailLink(driver).click();
	    //  Test_Helper.emaillink(driver).click();
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
	 			  Test_Helper.newpwd(driver).sendKeys("");
	 			  Test_Helper.confirmpwd(driver).sendKeys("Anuj123456");
	 			  Test_Helper.resetbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		 case "2":{
	 			  Test_Helper.newpwd(driver).sendKeys("Anuj123456");
	 			  Test_Helper.confirmpwd(driver).sendKeys("");
	 			  Test_Helper.resetbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		case "3":{
	 			Test_Helper.newpwd(driver).sendKeys("");
	 			  Test_Helper.confirmpwd(driver).sendKeys("");
	 			  Test_Helper.resetbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		case "4":{
	 			Test_Helper.newpwd(driver).sendKeys("Anuj123456");
	 			  Test_Helper.confirmpwd(driver).sendKeys("Anuj1234");
	 			  Test_Helper.resetbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		case "5":{
	 			Test_Helper.newpwd(driver).sendKeys("anuj123456");
	 			  Test_Helper.confirmpwd(driver).sendKeys("anuj123456");
	 			  Test_Helper.resetbtn(driver).click();
	 			  getscreenshot();
	 		      break; 
	 		 }
	 		case "6":{
	 			Test_Helper.newpwd(driver).sendKeys("Anuj123456");
	 			  Test_Helper.confirmpwd(driver).sendKeys("Anuj123456");
	 			  Test_Helper.resetbtn(driver).click();
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
}

