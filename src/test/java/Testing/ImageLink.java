package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLink {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.opencart.com/");
			//find webelement image link open cart
			driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/a/img")).click();
			
			
			// Title verifying
			System.out.println("Open Source Shopping Cart Solution");
			String expectedTitle="Open Source Shopping Cart Solution";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(expectedTitle,actualTitle,"Title is verified");
			driver.close();
			
	}

}
