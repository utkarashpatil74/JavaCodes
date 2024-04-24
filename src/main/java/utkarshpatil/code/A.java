package utkarshpatil.code;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) throws IOException {
		
	
		int numbers[]= {-1,23,-88,56,2322};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			
			
		}
		System.out.println(largest);
		System.out.println(smallest);

}
}