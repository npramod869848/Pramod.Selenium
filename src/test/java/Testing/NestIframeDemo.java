package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestIframeDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		//parent frame/outer frame
		driver.switchTo().frame("frame1");
		
		//child frame/inner frame
		driver.switchTo().frame("frame3");
		
		//find webelement checkbox
		driver.findElement(By.id("a")).click();
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		
		//find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("Pramod Nawale");
		
		// switch to main page
		// main page vrti yenyasathi default content method use kartat.
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("frame2");
		
		//find webelement animal dropdown
		WebElement dropDownElement=driver.findElement(By.id("animals"));
		Select dropDown=new Select(dropDownElement);
		
		dropDown.selectByVisibleText("avatar");
		
		
		
		driver.close();
		
	}

}
