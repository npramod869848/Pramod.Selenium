

	package testngparallel;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestNG_Parallel_Part2 {
		@Test(threadPoolSize=3,invocationCount=3)
		public void TC4()
	{
			System.out.println("This output is for tc4:"+Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://rediff.com");
			driver.manage().window().maximize();
	}
		
		@Test(threadPoolSize=3,invocationCount=3)
		public void TC5()
	{
			System.out.println("This output is for tc5:"+Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://makemytrip.com");
			driver.manage().window().maximize();
	}
		
		@Test(threadPoolSize=3,invocationCount=3)
		public void TC6()
	{
			System.out.println("This output is for tc6:"+Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://flipkart.com");
			driver.manage().window().maximize();
	}

	}


