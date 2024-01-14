package Testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T_SCRNSHT {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

		// Screenshot
		//driver object to the TakesScreenshot interface.
		TakesScreenshot tc = (TakesScreenshot) driver;
		
		
		//getScreenshotAs called TakesScreenshot object tc.
		//OutputType.FILE parameter specifies the output type as a file.
		//method returns a File object (src) representing the captured screenshot.
		File src = tc.getScreenshotAs(OutputType.FILE); 
		
		//FileHandler class is used to copy the captured screenshot (src) to a specified destination.
		FileHandler.copy(src, new File("D:\\Screenshot\\Screenshot.png5"));

		driver.close();	
	}

}
