package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Editproject {
	public static void editProject(WebDriver driver,WebDriverWait wait){
		 wait=new WebDriverWait(driver,30);
		 Org.publish(driver).click();
		  wait.until(ExpectedConditions.elementToBeClickable(Org.editOrgSection(driver)));
		  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='diffmodule-selection']/div[2]/div/div[2]/ul")));
		  List<WebElement> editorgsection=Org.editOrgSection(driver).findElements(By.tagName("a"));
		  for(int i=0;i<editorgsection.size();i++){
			  System.out.println(editorgsection.get(i).getText());
		  }
		  editorgsection.get(2).click();
		  wait.until(ExpectedConditions.elementToBeClickable(Org.editprosection(driver)));
		 // Org.editprosection(driver).findElement(By.linkText("ravabe")).click();
		  List<WebElement> editprosection=Org.editprosection(driver).findElements(By.tagName("a"));
		  for(int i=0;i<editprosection.size();i++){
			  
		  }
		  editprosection.get(1).click();
		  Org.accessbtn(driver).click();
	}
	public static void editChannel(WebDriver driver){
		List<WebElement> editprochannel=Org.editchannel(driver).findElements(By.tagName("label"));
		 for(int i=0;i<editprochannel.size();i++){
			 editprochannel.get(i).click();
		 }
	}

}
