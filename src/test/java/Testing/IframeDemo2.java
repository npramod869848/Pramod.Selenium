package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo2 {
	
	@BeforeMethod()
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			// switch to first frame
			WebElement iframeElement=driver.findElement(By.name("packageListFrame"));
			driver.switchTo().frame(iframeElement);
			
			//find webelement
			driver.findElement(By.linkText("org.openqa.selenium")).click();
			
			// switch to main page
			// main page vrti yenyasathi default content method use kartat.
			driver.switchTo().defaultContent();  
			
			// switch to second frame
			driver.switchTo().frame(1);
			
			//find webelement "Alert" link text of second frame
			driver.findElement(By.linkText("Alert")).click();
			
			// switch to main page
			// main page vrti yenyasathi default content method use kartat.
			driver.switchTo().defaultContent();  
			
			//find & print total iframes on web page
			int numberofiframes=driver.findElements(By.tagName("iframe")).size();
			System.out.println("numberofiframes:"+numberofiframes);
				
		}
	
	}



