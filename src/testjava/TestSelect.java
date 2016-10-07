package testjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelect {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://alpha.ravabe.com/sign-up");
		driver.manage().window().maximize();
		Select tz=new Select(driver.findElement(By.id("time-zone")));
		tz.selectByValue("Asia/Kolkata");
		WebElement timezone=driver.findElement(By.id("time-zone"));
		List<WebElement> tzlist=timezone.findElements(By.tagName("option"));
        System.out.println(tzlist.size());
        //timezone.findElement(By.tagName("").)
	}

}
