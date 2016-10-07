package testjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestMultipleSelect {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
        driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
        driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
        WebElement pf=driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
		List<WebElement> pfoptions=pf.findElements(By.tagName("td"));
		System.out.println("Number of phone features="+pfoptions.size());
		Actions builder=new Actions(driver);
		Action ms=builder.keyDown(Keys.CONTROL).click(pfoptions.get(2)).click(pfoptions.get(4)).click(pfoptions.get(6)).build();
        ms.perform();
		//driver.close();
		
	}		
}
