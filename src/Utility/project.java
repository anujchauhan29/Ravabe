package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class project {
	private static WebElement element=null;
	/*
	 * Add project
	 */
	public static WebElement prolink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div/div/div[1]/a/span"));
		return element;
	}
   //project name
	public static WebElement proname(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form/div/section[1]/div/div[1]/div[2]/input"));
		return element;
	}
	//Background 
	public static WebElement backGround(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form/div/section[1]/div/div[1]/div[3]/textarea"));
		return element;
	}
	//project type
	public static WebElement projecttype(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='project_type']"));
		return element;
	}
	//Add Channel 
	public static WebElement addChannel(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/div[1]/ul/li[1]/a[2]/div"));
		return element;
	}
	//save btn
	public static WebElement saveBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form/div/div[2]/div/div/button"));
		return element;
	}


	}


