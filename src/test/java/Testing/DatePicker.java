package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker{

	public static void main(String[] args) {
		
		
		// 02-May-2022
		
		String expectedDay="02";
		String expectedMonth="May";
		String ExpectedYear="2022";
		
		//Browser launch
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		// windows maximize
		driver.manage().window().maximize();
     	driver.get("https://jqueryui.com/datepicker/");
     	
     	//switch to iframe (datepicker ha iframe madhe ahe mhnun)
     	driver.switchTo().frame(0);
     	
     	// find datepicker webelement to perform click action.
     	
     	WebElement datepicker = driver.findElement(By.id("datepicker"));
     	datepicker.click();
     	
     	while(true)
     	{
     		String calenderMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
     		String calenderYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
     		
     		if(calenderMonth.equals(expectedMonth)&&calenderYear.equals(ExpectedYear));
     		{
     		List <WebElement> daysList=driver.findElements(By.xpath("//table/tbody/tr/td"));
     				for(WebElement e:daysList)    //list compare kraychi expected day sathi
     				{
     					String calenderDay=e.getText();
     					if(calenderDay.equals(expectedDay))
     					{
     						e.click();
     						break;
     					}
     				
     		
     				break;    //month year match zale ki break hoil
     		}
     	}
     		
     	  //  else      //calender month and year equal nasti tr..	next button vr click krne
     	}
     	
	//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
     		
}
}
     	
