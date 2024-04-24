package utkarshpatil.code;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotCode {

    static WebDriver driver;

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        try {
            driver.get("https://www.facebook.com");

            takeScreenshot("Facebook");

        } finally {
            // Make sure to close the WebDriver instance
            driver.quit();
        }
    }

    public static void takeScreenshot(String fileName) throws IOException {
        // 1. take screenshot and store it as a file format
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // 2. now copy the screenshot to the desired location using copyFile method
        FileUtils.copyFile(file, new File("C:\\Users\\utkar\\eclipse-workspace\\code\\src\\main\\java\\Screenshot\\" + fileName + ".jpg"));
    }
}
