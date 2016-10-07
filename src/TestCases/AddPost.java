package TestCases;

import org.testng.annotations.Test;

import Utility.Org;
import Utility.TakeVideo;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.JavascriptExecutor;

public class AddPost {
	private static ScreenRecorder scr;
public static WebDriver driver=null;

  @BeforeMethod
  public void beforeMethod() {
	    driver=new ChromeDriver();
		refLogin.dologin(driver);
  }
  @Test
  public void addPost() throws IOException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(0).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  int i;
	  for(i=0;i<prosection.size();i++){
		System.out.println(prosection.get(i).getText());
		}
	  //prosection.get(i-1).click();
	  //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Org.ProjectSection(driver).findElement(By.linkText("p10")));
	  //Actions build=new Actions(driver);
	  //Action mousedown=build.moveToElement(Org.ProjectSection(driver).findElement(By.linkText("p10"))).build();
	  //mousedown.perform();
	 
	  Org.ProjectSection(driver).findElement(By.linkText("PROJECT1")).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
	  //firefox specific issue
	  //driver.switchTo().frame("mce_0_ifr");
	  //chrome specific issue
	  //schedule post code begain:
	  ((JavascriptExecutor)driver).executeScript ("document.getElementById('datepicker3').removeAttribute('readonly');");
	  
	  //driver.findElement(By.id("mce_0_ifr")).sendKeys("test schedule post");
	  Org.getCalender(driver).click();
	  List<WebElement> calenderdiv=Org.datePicker(driver).findElements(By.tagName("a"));
      for(i=0;i<calenderdiv.size();i++){
    	  System.out.println(calenderdiv.get(i).getText());
      }
	  Org.selectCurrentDate(driver).click();
	  Org.getTime(driver).click();
	  List<WebElement> timediv=Org.getTimeSection(driver).findElements(By.tagName("div"));
	  timediv.get(0).click();
	  //end
      Org.publishbtn(driver).click();
      
	  

  }
  @Test(enabled=false)
  public void postlink() throws IOException, InterruptedException {
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
	 // Org.postArea(driver).sendKeys(description);
	  Org.Linktxt(driver).sendKeys(Linkpost);
	  Org.insertbtn(driver).click();
	  Thread.sleep(3000);
      Org.publishbtn(driver).click(); 	  
  }
  @Test(enabled=false)
  public void linkwithtext() throws IOException, InterruptedException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
  }
  @Test(enabled=false)
  public void googlelinkpost() throws IOException, InterruptedException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
  }
  @Test(enabled=false)
  public void googlwithtext() throws IOException, InterruptedException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
	  
  }
  @Test(enabled=false)
  public void cotentwithtag() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	 
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(3).click();
	  System.out.print("Enter post Tag::");
      String Tagpost=br.readLine();
      Org.Nametag(driver).sendKeys(Tagpost);
      Org.NametagBtn(driver).click();
      Thread.sleep(3000);
      Org.publishbtn(driver).click();
      scr.stop();
  }
  @Test(enabled=false)
  public void contentlinktag() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  attachsection.get(3).click();
	  System.out.print("Enter post Tag::");
      String Tagpost=br.readLine();
      Org.Nametag(driver).sendKeys(Tagpost);
      Org.NametagBtn(driver).click();
      Thread.sleep(3000);
      Org.publishbtn(driver).click();
      scr.stop();
      
  }
  @Test(enabled=false)
  public void Imagewithcontent() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(0).click();
	  Org.ImageUpload(driver).click();
	  try {
			Runtime.getRuntime().exec("E://AutoIT//Upload File.exe");
			Thread.sleep(5000);
	     } 
	      catch (Exception e) {
			//TODO Auto-generated catch block
	    	  System.out.println(e.getMessage());
		
	      }
	  Thread.sleep(6000);
      Org.publishbtn(driver).click();
      scr.stop();
  }
  @Test(enabled=false)
  public void postfb() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
      Org.publishbtn(driver).click();
      scr.stop();
  }
  @Test(enabled=false)
  public void linkwithcontent() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
	  scr.stop();
	  
	  
  }
  @Test(enabled=false)
      public void googlelink() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
	  scr.stop();  
  }
  @Test(enabled=false)
  public void googlewithcontent() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(5000);
	  Org.publishbtn(driver).click();
	  scr.stop();
  }
  @Test(enabled=false)
  public void contentimagefb() throws Exception{
	 
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(0).click();
	  Org.ImageUpload(driver).click();
	  try {
			Runtime.getRuntime().exec("E://AutoIT//Upload File.exe");
			Thread.sleep(5000);
	     } 
	      catch (Exception e) {
			//TODO Auto-generated catch block
	    	  System.out.println(e.getMessage());
		
	      }
	  Thread.sleep(5000);
	  Org.ImagecancelBtn(driver).click();
	  Thread.sleep(5000);
	  Org.publishbtn(driver).click();
	  
  }
  @Test
  public void contentlinkimage() throws Exception{
	  List<WebElement>attachsection;
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	 
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	   attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(0).click();
	  Org.ImageUpload(driver).click();
	  try {
			Runtime.getRuntime().exec("E://AutoIT//Upload File.exe");
			Thread.sleep(5000);
	     } 
	      catch (Exception e) {
			//TODO Auto-generated catch block
	    	  System.out.println(e.getMessage());
		
	      }
	  Thread.sleep(5000);
	  Org.ImagecancelBtn(driver).click();
	  Thread.sleep(5000);
	   attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
      Thread.sleep(3000);
      Org.linkcancelBtn(driver).click();
      Thread.sleep(5000);
	  Org.publishbtn(driver).click();
	  
	  
	  scr.stop();
  }
  
  
  @AfterMethod
  public void afterMethod() {
	   // driver.close();
  }

}
