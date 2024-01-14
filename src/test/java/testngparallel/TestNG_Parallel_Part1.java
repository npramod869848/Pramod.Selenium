package testngparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Parallel_Part1 {
	@Test(threadPoolSize=3,invocationCount=3)
	public void TC1()
{
		System.out.println("This output is for tc1:"+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
}
	
	@Test(threadPoolSize=3,invocationCount=3)
	public void TC2()
{
		System.out.println("This output is for tc2:"+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
}
	
	@Test(threadPoolSize=3,invocationCount=3)
	public void TC3()
{
		System.out.println("This output is for tc3:"+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
}

}
