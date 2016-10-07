package testjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFindElements {
	private static WebDriver driver;
	public static void main(String args[]){
		driver=new ChromeDriver();
		driver.get("http://alpha.ravabe.com/sign-up");
		driver.manage().window().maximize();
		Select timezone=new Select(driver.findElement(By.id("time-zone")));
		List<WebElement> tzopt=timezone.getOptions();
		System.out.println(tzopt.size());
		for(int i=1;i<tzopt.size();i++){
			System.out.println(tzopt.get(i).getText());
		}
		/*
		 List<WebElement> timezone=driver.findElements(By.id("time-zone"));
		 System.out.println(timezone.size());
		for(int i=0;i<timezone.size();i++){
			System.out.println(timezone.get(i));
		}
		Select tz=new Select((WebElement) driver.findElements(By.id("time-zone")));
		List<WebElement> tzopt=tz.getOptions();
		for(int i=0;i<tzopt.size();i++){
			System.out.println(tzopt.get(i));
		}
		*/
		driver.close();
	}

}
