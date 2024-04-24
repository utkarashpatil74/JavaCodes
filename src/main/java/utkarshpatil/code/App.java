package utkarshpatil.code;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver;
	
    public static void main( String[] args ) throws IOException
    {
    	
      System.setProperty("webdriver.driver.chromedriver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
      
       driver=new ChromeDriver();
       driver.get("https://www.facebook.com");
       getSceenshot("Utkarshpatil");
        
    }
    


public static void getSceenshot(String filename) throws IOException {
	
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\utkar\\eclipse-workspace\\code\\src\\main\\java\\Screenshot\\"+filename+".jpg"));
}
}