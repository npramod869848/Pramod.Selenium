package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//switch to iframe moneyiframe
		driver.switchTo().frame("moneyiframe");
		//find webelement & print value.
		
		String nseindex=driver.findElement(By.id("nseindex")).getText();
		System.out.print("nseindex");
		driver.close();
	}

}
