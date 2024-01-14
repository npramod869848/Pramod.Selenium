package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) {
		// 08-July-2022;
		
				String expectedDay="08";
				//String expectedMonth="May";
				String ExpectedMonthYear="July 2022";
				
				//Browser launch
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				// windows maximize
				driver.manage().window().maximize();
		     	driver.get("https://www.redbus.in/");
		     	
		     	//switch to iframe (datepicker ha iframe madhe ahe mhnun)
		     	driver.switchTo().frame(0);
		     	
		     	// find datepicker webelement to perform click action.
		     	
		     	WebElement datepicker = driver.findElement(By.id("onward_cal"));
		     	datepicker.click();
		     	
		     	while(true)
		     	{
		     		
		     		String calenderMonthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		     		
		     		if(calenderMonthYear.equals(ExpectedMonthYear))
		     		{
		     		driver.findElement(By.xpath("//td[text()=' "+ expectedDay+ " ']")).click();
		     					
		     				
		     		
		     				break;    //month year match zale ki break hoil
		     		}
	

		     	  else      //calender month and year equal nasti tr..	next button vr click krne
		     	  {
		     	driver.findElement(By.xpath("//td[@class='next']")).click();
		     	  }
		     	}
	}
}
		   
