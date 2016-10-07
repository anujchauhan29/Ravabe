package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addchannel {

	private static WebElement element=null;
	/*
	 * nav point
	 */
    public static WebElement navPoint (WebDriver driver)
    {
    	element=driver.findElement(By.xpath("html/body/div[2]/nav/div/div[4]/ul/li[1]/a"));
    	return element;
    }
    /*
	 * dropdown channel
	 */
    public static WebElement dropdwn (WebDriver driver)
    {
    	element=driver.findElement(By.xpath("html/body/div[2]/nav/div/div[4]/ul/li[1]/ul/div/li[4]/a"));
    	return element;
    }
    
    /*
	 * Heapbox channel
	 */
    public static WebElement heapbox (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/a[2]"));
    	return element;
    }
    /*
   	 * fb channel
   	 */
    public static WebElement fb (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[3]/a"));
    	return element;
    }
    /*
   	 * twitter channel
   	 */
    public static WebElement twitter (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[4]/a"));
    	return element;
    }
    /*
   	 * Linkedin channel
   	 */
    public static WebElement linkedin (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[5]/a"));
    	return element;
    }
    /*
   	 * tumblr channel
   	 */
    public static WebElement tumblr (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[8]/a"));
    	return element;
    }
    /*
   	 * WP channel
   	 */
    public static WebElement WP (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[7]/a"));
    	return element;
    }
    /*
   	 * youtube channel
   	 */
    public static WebElement youtube (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[6]/a"));
    	return element;
    }
    /*
   	 * Btn channel
   	 */
    public static WebElement connectbtn (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='btn-connect']"));
    	return element;
    }
    /*
   	 * FB  channel
   	 */
    public static WebElement addfbid (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='email']"));
    	return element;
    }
    public static WebElement addfbpwd (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='pass']"));
    	return element;
    }
    public static WebElement fblogin (WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		 return element;
	 }
    public static WebElement fbformclick (WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(".//*[@id='u_0_o']/div[1]/div/div/div/div[1]/div[1]"));
		 return element;
	 }
    public static WebElement fbform (WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(".//*[@id='u_0_o']/div[2]/div[3]/button"));
		 return element;
	 }
    
    /*
   	 * twitter channel
   	 */
    public static WebElement addtwitter (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='username_or_email']"));
    	return element;
    }
    public static WebElement addtwitterpwd (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='password']"));
    	return element;
    }
    public static WebElement twisignin (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='allow']"));
    	return element;
    }
    /*
   	 * Linkedin channel
   	 */
    public static WebElement addLinkedin (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='session_key-oauth2SAuthorizeForm']"));
    	return element;
    }
    public static WebElement Linkedinpwd (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='session_password-oauth2SAuthorizeForm']"));
    	return element;
    }
    public static WebElement Linkedallowed (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='body']/div/form/div[2]/ul/li[1]/input"));
    	return element;
    }
    /*
   	 * WP channel
   	 */
    public static WebElement wpUrl (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='site_url']"));
    	return element;
    }
    public static WebElement wpdisplay (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='display_name']"));
    	return element;
    }
    public static WebElement wpUsername (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='username']"));
    	return element;
    }
    public static WebElement wpPwd (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='password']"));
    	return element;
    }
    public static WebElement wpConnectbtn (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='button1']"));
    	return element;
    }
    /*
   	 * Tumblr channel
   	 */
    public static WebElement Tumblruser (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='signup_determine_email']"));
    	return element;
    }
    public static WebElement Tumblnext (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='signup_forms_submit']"));
    	return element;
    }
    public static WebElement Tumblpwd (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='signup_password']"));
    	return element;
    }
    public static WebElement Tumbllogin (WebDriver driver)
    {
    	element=driver.findElement(By.xpath(".//*[@id='signup_forms_submit']"));
    	return element;
    }
    public static WebElement Tumblrallow (WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(".//*[@id='api_v1_oauth_authorize']/div[2]/div/div[1]/div/div/div[2]/form/button[2]"));
		 return element;
	 }
}
