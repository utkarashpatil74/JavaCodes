package utkarshpatil.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		 int timeoutSeconds = 10;
		
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
		
		driver.switchTo().alert().accept();
		
		DesiredCapabilities capabilities = DesiredCapabilities
		

				
				

	}

}
