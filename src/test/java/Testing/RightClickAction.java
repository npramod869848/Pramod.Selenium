package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		/*WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform(); */
		//act.contextClick(button).perform();    //Right Click action
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).perform(); //double click action
		
	}

}
