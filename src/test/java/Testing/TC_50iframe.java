package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_50iframe {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://example.com");
			
		

	        // Switch to the parent frame if needed
	        driver.switchTo().frame("More information...");

	        // Switch to the 50th frame
	        driver.switchTo().frame(50);
	        driver.quit();
	}

}
