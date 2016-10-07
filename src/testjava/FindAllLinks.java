package testjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=cw7LV9KXH4nI8AfP_4AQ");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links="+links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		driver.close();

	}

}
