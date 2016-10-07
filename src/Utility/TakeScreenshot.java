package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	public static void getScreenShot(WebDriver driver) throws Exception {
    
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot 
            FileUtils.copyFile(scrFile, new File("E:\\Screenshots\\Add_dataroom\\" +System.currentTimeMillis()+ ".png"));
    }
}
