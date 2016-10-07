package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test_Helper {
	private static WebElement element=null;
	private static String emailId;
	private static String passwordId;
	private static String loginbtnXpath;
	private static String publishenterXpath;
	
	public static void getPageElements(){
		Properties prop = new Properties();
		InputStream input= null;

		try {

			input = new FileInputStream("D://workspace-mars//Ravabe//src//properties//login-elements.properties");

			// load a properties file
			prop.load(input);
            //get the property value
			emailId=prop.getProperty("email-id");
			passwordId=prop.getProperty("password-id");
			loginbtnXpath=prop.getProperty("login-button-xpath");
            publishenterXpath=prop.getProperty("publish-enter-xpath");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	static {
	    getPageElements();
	  }

	   /*
	    * Signup Page
	    */
	//Signup Link on login page
	  public static WebElement Link(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/p/a"));
		   return element;
	   }
	   //first name text box
	   public static WebElement firstName(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='signup-form']/div[1]/input"));
		   return element;
	   }
	   //second name text box
	   public static WebElement lastName(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='signup-form']/div[2]/input"));
		   return element;
	   }
	   public static WebElement Email(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email']"));
		   return element;
	   }
	  //confirm password text box
	   public static WebElement Password(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='password']"));
		   return element;
	   }
	   //Choose your timezone
	   public static void selectTimeZone(WebDriver driver)
	   {
	   Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='time-zone']")));
	   dropdown.selectByValue("Asia/Kolkata");
	   }
	   //Terms and conditions check box
	   public static WebElement acceptTerms(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='signup-form']/div[8]/p/input"));
		   return element;
	   }
	   
	   //signup button
	   public static WebElement  signup(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='sign_up']"));
		   return element;
	   }
	   
	   
	   /*
	    * Login
	    */
	   //Email address 
	   public static WebElement EmailAddress(WebDriver driver)
	   {
		   element=driver.findElement(By.id(emailId));
		   return element;
	   }
     
	   //Password
	   
	   public static WebElement LoginPassword(WebDriver driver)
	   {
		   element=driver.findElement(By.id(passwordId));
		   return element;
	   }
	   
	   //Check box
	   
	   public static WebElement Checkbox(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='login-form']/div[3]/label/input"));
		   return element;
	   }
	   
	   //Login Button
	   
	   public static WebElement Login(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(loginbtnXpath));
		   return element;
	   }
	   
	   /*
	    * Landing page
	    */
	   
	   public static WebElement publishEnter(WebDriver driver){
		   
		   element=driver.findElement(By.xpath(publishenterXpath));
		   return element;
	   }
	   
	   /*
	    * Lost Your password
	    */
	   //Click on link Lost password
	   
	  public static WebElement LostpwdLink(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div[2]/a"));
		  return element;
	  }
	   //Email 
	  public static WebElement Lostemail(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='email']"));
		  return element;
	  }
	   
	  //Submit button
	   
	  public static WebElement submitbtn(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='forgot-password-form']/div/div[3]/button"));
		  return element;
	  }
	  
	  
	  /*
	   * reset password 
	   */
	  
	  //Link email
	  public static WebElement gmailemail(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='Email']"));
		  return element;
	  }
	  public static WebElement gmailbtn(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='next']"));
		  return element;
	  }
	  public static WebElement gmailpwd(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='Passwd']"));
		  return element;
	  }
	  public static WebElement signin(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='signIn']"));
		  return element;
	  }
	  public static WebElement emailLink(WebDriver driver)
	  {
		  element=driver.findElement(By.linkText("Ravabe"));
		  return element;
	  }
	  
	  //New password 
	  
	  public static WebElement newpwd(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='password']"));
		  return element;
	  }
	  
	  //Confirm password 
	  
	  public static WebElement confirmpwd(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='confirm_password']"));
		  return element;
	  }
	  
	  //reset button
	  
	  public static WebElement resetbtn(WebDriver driver)
	  {
		  element=driver.findElement(By.xpath(".//*[@id='reset_password']/button"));
		  return element;
	  }
	  
}
