package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DP {
//parameter la data provide karnyasathi dp banvla.
//1.india qutub minar
//2.Agra taj mahal
//3.Hyderabad charminar
	
	 /*@DataProvider(name="searchDataSet")//DP madhe attribute takle
	public Object[][]searchData()
	{
		Object[][] searchKeyword=new Object [3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="Qutub Minar";
		
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="Taj Mahal";
		
		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]="Char Minar";
		
		return searchKeyword;    
		
		
	} */      //DP hya class mdhe chalto taripn dusra class tayar kla(DPMethod)
	
	
	@Test(dataProvider="searchDataSet",dataProviderClass=DPMethod.class) //DP attribute mdhe searchdataset chi value inject kli
		public void TestCaseGoogleSearch(String country,String monument )
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			
			//WebDriverManager.edgedriver().setup();
			//WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			WebElement searchbox=driver.findElement(By.name("q"));
			
			//enter key combination of country and monument
			searchbox.sendKeys(country + " " + monument);
			
			driver.findElement(By.name("btnk")).submit();
			
		}
	
		
}



