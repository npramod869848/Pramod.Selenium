package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	         WebDriver driver;
	         
	public GoogleSearch(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchbox=By.xpath("//input[@name='q']");
	By search_btn=By.xpath("(//input[@name='btnk'])[1]");
	By Facebook_Link=By.xpath("//a//h3[text()='Facebook-Log i or Sign Up']");


	public void searchgoogle(String searchinput)
	{
		try
		{
		driver.findElement(searchbox).sendKeys(searchinput);
		Thread.sleep(2000);
		driver.findElement(search_btn).click();
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exceptions caught" + e.getMessage());
		}
	}
	public void ClickFacebook() {
		try {
			driver.findElement(Facebook_Link).click();
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exceptions Caught"+ e.getMessage());
		}
	}
}
