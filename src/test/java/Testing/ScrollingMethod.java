package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingMethod {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//open url
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();	

		/*1] to scroll down the web page by pixel
			executeScript("window.scrollBy(x-pixels,y-pixels)"); */

		//interface				//type casting
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");  //scroll vertically down by 500 pixels.


		/* 2] To scroll down the web page by the visibility of the element.
		      js.executeScript("arguments[0].scrollIntoView();", Element); */
		      WebElement element=driver.findElement(By.linkText("BMI Calculator"));
		      js.executeScript("arguments[0].scrollIntoView();",element);   //scroll till visibility of web element.

		/* 3] To scroll down the web page at the bottom of the page
		      js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); */
		      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


		/* 4] Horizontal scroll on the web page
		      js.executeScript("arguments[0].scrollIntoView();",Element);  */



	}

}
