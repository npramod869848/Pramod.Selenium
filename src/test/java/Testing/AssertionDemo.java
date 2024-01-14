package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
      @Test
	public void testMethod() {
		
		// Launch Chrome Browser
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); */
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		// softassert class cha object create karne.
		
		SoftAssert softverify=new SoftAssert();
		
		//open url 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Title verifying
		System.out.println("verifying tittle....");
		String expectedTitle="Automation Testing Practice1";
		String actualTitle=driver.getTitle();
		softverify.assertEquals(expectedTitle,actualTitle,"Title is verified");
		
		// wikipedia icon display hoto ki nahi te check karne
		
		System.out.println("verifying presence of wikipedia_icon");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		softverify.assertTrue(icon.isDisplayed());
		
		// search button verify
		System.out.println("verifying presence of search button");
		WebElement searchbtn=driver.findElement(By.className("wikipedia-search-button"));
		softverify.assertTrue(searchbtn.isDisplayed());
		
		driver.close();
		
		//report all failure msg
		softverify.assertAll();
	}
}
