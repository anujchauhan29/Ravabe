package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Org {
	private static WebElement element=null;
	private static List<WebElement> lielement=null;
	private static String orgnameXpath;
	private static String orgdescriptionXpath;
	private static String companywebsiteId;
	private static String companywebsiteaddbtnXpath;
	private static String orgsavebtnXpath;
	private static String confirmClass;
	private static String sweetAlertClass;

	private static String addlinkxpath;
	private static String addpostxpath;
	private static String orgsection;
	private static String projectsection;
	private static String channelsection;
	private static String posttypesection;
	private static String twitter;
	private static String facebook;
	private static String addpostbtn;
	private static String cancelpostxpath;
	private static String textcontainer;
	private static String postcontainer;
	private static String publish;
	private static String savedraft;
    private static String attachmentXpath;
	private static String postlink;
	private static String insertlink;
	private static String shortenurlid;
	private static String tagtext;
	private static String tagaddbtn;

	private static String addImage;
	private static String imagepopupcancelbtn;
	private static String linkpopupcancelbtn;
	


	private static String calenderId;
	private static String calenderXpath;
	private static String calenderClass;
    private static String datepickerId;
	private static String currentDateClass;
	private static String timepickerId;
    private static String timeClass;
    

	private static String addbuttonXpath;
	private static String addprojectXpath;
	private static String selectbuttonXpath;
	private static String pronameid;
	private static String prodescriptionXpath;
	private static String prochannelXpath;
	private static String prosaveXpath;
	private static String orgsectionXpath;
	private static String proteamid;
	private static String addemailid;
	private static String publishXpath;
	private static String editorgsectionXpath;
	private static String editprosectionXpath;
	private static String accessbtnXpath;
	private static String editnameid;
	private static String editdescriptionXpath;
	private static String editchannelXpath;
	private static String editteamid;
	private static String editaddbtnXpath;
	private static String updatebtnXpath;
	
	private static String projectfileXpath;
	private static String projectfileClass;
	private static String projectteamsectionXpath;

	public static void getPageElements(){
		Properties prop = new Properties();
		InputStream input= null;

		try {



			input = new FileInputStream("D://workspace-mars//Ravabe//src//properties//org-elements.properties");


			// load a properties file
			prop.load(input);
            //get the property value
			orgnameXpath=prop.getProperty("org-name-xpath");
			orgdescriptionXpath=prop.getProperty("org-description-xpath");
			companywebsiteId=prop.getProperty("company-website-id");
			companywebsiteaddbtnXpath=prop.getProperty("company-website-addbtn-xpath");
			orgsavebtnXpath=prop.getProperty("org-savebtn-xpath");
			confirmClass=prop.getProperty("confirm-class");
			sweetAlertClass=prop.getProperty("sweet-alert-class");

			addlinkxpath=prop.getProperty("add-link-xpath");
			addpostxpath=prop.getProperty("add-post-xpath");
			orgsection=prop.getProperty("org-section");
			projectsection=prop.getProperty("project-section");
			channelsection=prop.getProperty("channel-section");
			posttypesection=prop.getProperty("post-type-section");
			twitter=prop.getProperty("twitter-class");
			facebook=prop.getProperty("facebook-class");
			addpostbtn=prop.getProperty("addpost-xpath");
			cancelpostxpath=prop.getProperty("cancel-post-xpath");
			postcontainer=prop.getProperty("post-container-id");
			 publish=prop.getProperty("publishbtn-xpath");
			 savedraft=prop.getProperty("savedraft-xpath");
			 attachmentXpath=prop.getProperty("attach-xpath");
			 postlink=prop.getProperty("link-text-xpath");
			 insertlink=prop.getProperty("link-btn-xpath");
			 shortenurlid=prop.getProperty("short-url-id");
			 tagtext=prop.getProperty("tag-text-xpath");
			 tagaddbtn=prop.getProperty("tag-add-xpath");

			 addImage=prop.getProperty("add-image-class");
			 imagepopupcancelbtn=prop.getProperty("image-cancelbtn-xpath");
			 linkpopupcancelbtn=prop.getProperty("link-cancelbtn-xpath");


			 calenderId=prop.getProperty("calender-id");
			 calenderXpath=prop.getProperty("calender-xpath");
			 calenderClass=prop.getProperty("calender-class");
			 datepickerId=prop.getProperty("date-picker-id");
			 currentDateClass=prop.getProperty("current-date-class");
			 timepickerId=prop.getProperty("time-picker-id");
			 timeClass=prop.getProperty("time-class");
			 

			addbuttonXpath=prop.getProperty("add-button-xpath");
			addprojectXpath=prop.getProperty("add-project-xpath");
			selectbuttonXpath=prop.getProperty("select-button-xpath");
			pronameid=prop.getProperty("pro-name-id");
			prodescriptionXpath=prop.getProperty("pro-description-xpath");
			prochannelXpath=prop.getProperty("pro-channel-xpath");
			prosaveXpath=prop.getProperty("pro-save-xpath");
		    orgsectionXpath=prop.getProperty("org-section-xpath");
			proteamid=prop.getProperty("pro-team-id");
			addemailid=prop.getProperty("email-add-xpath");
			publishXpath=prop.getProperty("publish-project-xpath");
			editorgsectionXpath=prop.getProperty("editorg-section-xpath");
			editprosectionXpath=prop.getProperty("editpro-section-xpath");
			accessbtnXpath=prop.getProperty("access-btn-xpath");
			editnameid=prop.getProperty("edit-proname-id");
			editdescriptionXpath=prop.getProperty("edit-prodesc-xpath");
			editchannelXpath=prop.getProperty("edit-prochannel-xpath");
			editteamid=prop.getProperty("edit-proteam-id");
			editaddbtnXpath=prop.getProperty("edit-teamaddbtn-xpath");
			updatebtnXpath=prop.getProperty("Update-btn-xpath");
						
			projectfileXpath=prop.getProperty("project-file-xpath");
			projectfileClass=prop.getProperty("project-file-class");
			projectteamsectionXpath=prop.getProperty("project-team-section-xpath");
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
	   *Add organization 
	    */
	 public static WebElement OrgLink(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[2]/nav/div/div[2]/ul/li[2]"));
		   return element;
	   }
	 //Add org. button
	 public static WebElement AddOrg(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[1]/a/span"));
		   return element;
	   }
	 //org name 

	 public static WebElement Orgname(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgnameXpath));
		   return element;
	   }
      //org description 
	 public static WebElement OrgDiscription(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgdescriptionXpath));
		   return element;
	   }
	 //org add people 
	 public static WebElement OrgAddpeople(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email_value']"));
		   return element;
	   }
	 //org add people btn
	 public static WebElement OrgAddpeoplebtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/section[2]/div/div/div[1]/div/span/img"));
		   return element;
	   }
	 //company 
	 public static WebElement OrgCompanysite(WebDriver driver)
	   {
		   element=driver.findElement(By.id(companywebsiteId));
		   return element;
	   }
	 //company add btn
	 public static WebElement OrgCompanyadd(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(companywebsiteaddbtnXpath));
		   return element;
	   }
	 //Save btn
	 public static WebElement OrgSave(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgsavebtnXpath));
		   return element;
	   }
	 //cancel button 
	 public static WebElement OrgCancel(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/div/div/div/button[2]"));
		   return element;
	   }
      //Add Image
	 public static WebElement AddImage(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='file-uploader']/div"));
		   return element;
	   }
	 public static WebElement ConfirmDialogue(WebDriver driver){
		 element=driver.findElement(By.className(confirmClass));
		 return element;
	 }
	public static WebElement SweetAlert(WebDriver driver){
		element=driver.findElement(By.className(sweetAlertClass));
		return element;
	}

	//add post
	public static WebElement AddLink(WebDriver driver){
		element=driver.findElement(By.xpath(addlinkxpath));
		return element;
	}
	public static WebElement AddPost(WebDriver driver){
		element=driver.findElement(By.xpath(addpostxpath));
		return element;
	}
	public static WebElement OrgSection(WebDriver driver){
		element=driver.findElement(By.xpath(orgsection));
		return element;
	}
	public static WebElement ProjectSection(WebDriver driver){
		element=driver.findElement(By.xpath(projectsection));
		return element;
	}
	public static WebElement ChannelSection(WebDriver driver){
		element=driver.findElement(By.xpath(channelsection));
		return element;
	}
	public static WebElement PostTypeSection(WebDriver driver){
		element=driver.findElement(By.xpath(posttypesection));
		return element;
	}
	public static WebElement selectTwitter(WebDriver driver){
		element=driver.findElement(By.className(twitter));
		return element;
	}
	public static WebElement selectfacebook(WebDriver driver){
		element=driver.findElement(By.className(facebook));
		return element;
	}
	public static WebElement AddPostBtn(WebDriver driver){
		element=driver.findElement(By.xpath(addpostbtn));
		return element;
	}
	public static WebElement CancelPost(WebDriver driver){
		element=driver.findElement(By.xpath(cancelpostxpath));
		return element;
	}
	public static WebElement textarea(WebDriver driver){
		element=driver.findElement(By.id(textcontainer));
		return element;
	}
	public static WebElement postArea(WebDriver driver){
		element=driver.findElement(By.id(postcontainer));
		return element;
	}
	public static WebElement publishbtn(WebDriver driver){
		element=driver.findElement(By.xpath(publish));
		return element;
	}
	public static WebElement linktaglocation(WebDriver driver){
		element=driver.findElement(By.xpath(attachmentXpath));
		return element;
	}
	
	
	public static WebElement Linktxt(WebDriver driver){
		element=driver.findElement(By.xpath(postlink));
		return element;
	}
	public static WebElement insertbtn(WebDriver driver){
		element=driver.findElement(By.xpath(insertlink));
		return element;
	}
	public static void bitlydropdown(WebDriver driver){
		Select dropdown = new Select(driver.findElement(By.id(shortenurlid)));
		dropdown.selectByIndex(0);
		
	}
	public static void googledropdown(WebDriver driver){
		Select dropdown = new Select(driver.findElement(By.id(shortenurlid)));
		dropdown.selectByIndex(1);
		
	}
	public static WebElement Nametag(WebDriver driver){
		element=driver.findElement(By.xpath(tagtext));
		return element;
	}
	public static WebElement NametagBtn(WebDriver driver){
		element=driver.findElement(By.xpath(tagaddbtn));
		return element;
	}
	public static WebElement ImageUpload (WebDriver driver){
		element=driver.findElement(By.className(addImage));
		return element;
	}
	public static WebElement ImagecancelBtn(WebDriver driver){
		element=driver.findElement(By.xpath(imagepopupcancelbtn));
		return element;
	}
	public static WebElement linkcancelBtn(WebDriver driver){
		element=driver.findElement(By.xpath(linkpopupcancelbtn));
		return element;
	}
	
	/*
	 * Add project 
	 */
	 public static WebElement addbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(addbuttonXpath));
		   return element;
	   }
	 public static WebElement addproject(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(addprojectXpath));
		   return element;
	   }
	 public static WebElement selectbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(selectbuttonXpath));
		   return element;
	   }
	 public static WebElement proName(WebDriver driver)
	   {
		   element=driver.findElement(By.id(pronameid));
		   return element;
	   }
	 public static WebElement proDescription(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(prodescriptionXpath));
		   return element;
	   }
	 public static WebElement projectFile(WebDriver driver){
		 element=driver.findElement(By.xpath(projectfileXpath));
		 return element;
	 }
	 public static WebElement projectAddFile(WebDriver driver){
		 element=driver.findElement(By.className(projectfileClass));
		 return element;
	 }
	 public static WebElement prochannel(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(prochannelXpath));
		   return element;
	   }
	 public static WebElement projectTeamSection(WebDriver driver){
		 element=driver.findElement(By.xpath(projectteamsectionXpath));
		 return element;
	 }
	 public static WebElement savebtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(prosaveXpath));
		   return element;
	   }
	 public static WebElement orgsection(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgsectionXpath));
		   return element;
	   }
	 public static WebElement proteam(WebDriver driver)
	   {
		   element=driver.findElement(By.id(proteamid));
		   return element;
	   }
	 public static WebElement addemailbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(addemailid));
		   return element;
	   }
	 /*
	  * Edit project
	  */
	 

	 public static WebElement publish(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(publishXpath));
		   return element;
	   }
	 public static WebElement editOrgSection(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(editorgsectionXpath));
		   return element;
	   }
	 public static WebElement editprosection(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(editprosectionXpath));
		   return element;
	   }
	 public static WebElement accessbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(accessbtnXpath));
		   return element;
	   }
	 public static WebElement editname(WebDriver driver)
	   {
		   element=driver.findElement(By.id(editnameid));
		   return element;
	   }
	 public static WebElement editdescription(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(editdescriptionXpath));
		   return element;
	   }
	 public static WebElement editchannel(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(editchannelXpath));
		   return element;
	   }
	 public static WebElement editemail(WebDriver driver)
	   {
		   element=driver.findElement(By.id(editteamid));           
		   return element;
	   }
	 public static WebElement editaddbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(editaddbtnXpath));           
		   return element;
	   }
	 public static WebElement updatebtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(updatebtnXpath));           
		   return element;
	   }
     //Schedule post
	 public static WebElement getCalender(WebDriver driver){
		 element=driver.findElement(By.id(calenderId));
		 return element;
	 }
	 public static WebElement getCal(WebDriver driver){
		 element=driver.findElement(By.xpath(calenderXpath));
		 return element;
	 }
	 public static WebElement viewCalender(WebDriver driver){
		 element=driver.findElement(By.className(calenderClass));
		 return element;
	 }
	 public static WebElement datePicker(WebDriver driver){
		 element=driver.findElement(By.id(datepickerId));
		 return element;
	 }
	 public static WebElement selectCurrentDate(WebDriver driver){
		 element=driver.findElement(By.className(currentDateClass));
		 return element;
	 }
	 public static WebElement getTime(WebDriver driver){
		 element=driver.findElement(By.id(timepickerId));
		 return element;
	 }
	 public static WebElement getTimeSection(WebDriver driver){
		 element=driver.findElement(By.className(timeClass));
		 return element;
	 }
}
