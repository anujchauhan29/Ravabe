package TestCases;

import org.testng.annotations.Test;

//import com.thoughtworks.selenium.webdriven.commands.Refresh;

import Utility.addchannel;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddchannelNG {
	public static  WebDriver driver;
  @Test(enabled=false)
  public void testfb() throws Exception {
	  refLogin.dologin(driver);
	  addchannel.navPoint(driver).click();
	  Thread.sleep(2000);
	  addchannel.dropdwn(driver).click();
	  Thread.sleep(2000);
	  addchannel.heapbox(driver).click();
	  Thread.sleep(2000);
	  addchannel.fb(driver).click();
	  Thread.sleep(2000);
	  addchannel.connectbtn(driver).click();
	  Thread.sleep(2000);
	  Set <String> set1=driver.getWindowHandles();
      Iterator <String> win1=set1.iterator();
      String parent=win1.next();
      String child=win1.next();
      driver.switchTo().window(child);
      addchannel.addfbid(driver).sendKeys("anuj@ravabe.com");
      addchannel.addfbpwd(driver).sendKeys("anujchauhan");
      addchannel.fblogin(driver).click();
      Thread.sleep(4000);
      addchannel.fbformclick(driver).click();
      Thread.sleep(5000);
      addchannel.fbform(driver).click();
      Thread.sleep(5000);
      driver.switchTo().window(parent);
  }
  @Test(enabled=false)
  public void testtwitter() throws Exception {
	  refLogin.dologin(driver);
	  addchannel.navPoint(driver).click();
	  Thread.sleep(2000);
	  addchannel.dropdwn(driver).click();
	  Thread.sleep(2000);
	  addchannel.heapbox(driver).click();
	  Thread.sleep(2000);
	  addchannel.twitter(driver).click();
	  Thread.sleep(2000);
	  addchannel.connectbtn(driver).click();
	  Thread.sleep(2000);
	  Set <String> set1=driver.getWindowHandles();
      Iterator <String> win1=set1.iterator();
      String parent=win1.next();
      String child=win1.next();
      driver.switchTo().window(child);
      addchannel.addtwitter(driver).sendKeys("acanujchauhan3@gmail.com");
      addchannel.addtwitterpwd(driver).sendKeys("anujchauhan29");
      addchannel.twisignin(driver).click();
      Thread.sleep(5000);
      driver.switchTo().window(parent); 
  }
  @Test(enabled=false)
  public void linkedin() throws Exception {
	  refLogin.dologin(driver);
	  addchannel.navPoint(driver).click();
	  Thread.sleep(2000);
	  addchannel.dropdwn(driver).click();
	  Thread.sleep(2000);
	  addchannel.heapbox(driver).click();
	  Thread.sleep(2000);
	  addchannel.linkedin(driver).click();
	  Thread.sleep(2000);
	  addchannel.connectbtn(driver).click();
	  Thread.sleep(2000);
	  Set <String> set1=driver.getWindowHandles();
	  Iterator <String>win1=set1.iterator();
	  String parent=win1.next();
	  String child=win1.next();
	  driver.switchTo().window(child);
	  addchannel.addLinkedin(driver).sendKeys("acanujchauhan3@gmail.com");
	  addchannel.Linkedinpwd(driver).sendKeys("anujchauhan29");
	  addchannel.Linkedallowed(driver).click();
	  Thread.sleep(5000);
	  driver.switchTo().window(parent);
  }
  @Test(enabled=false)
  public void WP() throws Exception {
	  refLogin.dologin(driver);
	  addchannel.navPoint(driver).click();
	  Thread.sleep(2000);
	  addchannel.dropdwn(driver).click();
	  Thread.sleep(2000);
	  addchannel.heapbox(driver).click();
	  Thread.sleep(2000);
	  addchannel.WP(driver).click();
	  Thread.sleep(2000);
	  addchannel.connectbtn(driver).click();
	  Thread.sleep(2000);
	  Set <String> set1=driver.getWindowHandles();
	  Iterator <String>win1=set1.iterator();
	  String parent=win1.next();
	  String child=win1.next();
	  driver.switchTo().window(child);
	  addchannel.wpUrl(driver).sendKeys("http://www.bigaltestsite.com/test1/");
	  Thread.sleep(2000);
	  addchannel.wpdisplay(driver).sendKeys("Anuj");
	  addchannel.wpUsername(driver).sendKeys("ravabe5");
	  addchannel.wpPwd(driver).sendKeys("QA@WSX3edc");
	  addchannel.wpConnectbtn(driver).click();
	  Thread.sleep(5000);
	  driver.switchTo().window(parent);
  }
  @Test
  public void Tumblr() throws Exception {
	  refLogin.dologin(driver);
	  addchannel.navPoint(driver).click();
	  Thread.sleep(2000);
	  addchannel.dropdwn(driver).click();
	  Thread.sleep(2000);
	  addchannel.heapbox(driver).click();
	  Thread.sleep(2000);
	  addchannel.tumblr(driver).click();
	  Thread.sleep(2000);
	  addchannel.connectbtn(driver).click();
	  Thread.sleep(2000);
	  Set <String> set1=driver.getWindowHandles();
	  Iterator <String>win1=set1.iterator();
	  String parent=win1.next();
	  String child=win1.next();
	  driver.switchTo().window(child);
	  addchannel.Tumblruser(driver).sendKeys("acanujchauhan3@gmail.com");
	  addchannel.Tumblnext(driver).click();
	  Thread.sleep(2000);
	  addchannel.Tumblpwd(driver).sendKeys("Anuj123456");
	  Thread.sleep(2000);
	  addchannel.Tumbllogin(driver).click();
	  Thread.sleep(2000);
	  addchannel.Tumblrallow(driver).click();
	  Thread.sleep(5000);
	  driver.switchTo().window(parent);
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.navigate().to("http://test.ravabe.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
