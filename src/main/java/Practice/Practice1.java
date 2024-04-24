package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class Practice1 {

	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		getScreenshot("jhshd");

	}
	
	public static void getScreenshot(String filename) throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\utkar\\eclipse-workspace\\code\\src\\main\\java\\Screenshot\\"+filename+".jpg"));
	}

}
