package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T_Languages {
	@Test
public void testMethod() {
		
		// Launch Chrome Browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		
		//open url
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// Find and print the available languages
	       List<WebElement> languagesContainer = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	      // for(WebElement lang : languagesContainer);
	      String str=languagesContainer.toString();
	        System.out.println(str);

	        // Close the browser
	        driver.quit();
}
}