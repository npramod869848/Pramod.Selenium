package TestScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Facebookpage;
import PageObject.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
WebDriver driver;
GoogleSearch objectrepo;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	@Test(priority=1)
	public void searchoperation() throws InterruptedException {
		GoogleSearch page=new GoogleSearch(driver);
		page.searchgoogle("facebook");
		Thread.sleep(5000);
	}
		
	@Test(priority=2)
	public void VerifyandAccessFacebook() {
		objectrepo=new GoogleSearch(driver);
		objectrepo.ClickFacebook();
	}
	@Test(priority=3)
	public void VerifyLogin1() {
		Facebookpage page=new Facebookpage(driver);
		page.EnterUsername();
		page.Enterpassword();
		page.VerifyLogin();
	}
	
		
	//private void VerifyLogin() {
		// TODO Auto-generated method stub
		
	

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
