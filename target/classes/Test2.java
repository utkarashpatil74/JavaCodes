import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chromedriver","C:\Users\utkar\OneDrive\Documents\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By)
		
		int arr[]= {1,2,3,4,5};
		
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				
				largest=arr[i];
			}
		}
		System.out.println(largest);
		
		

	}

}
