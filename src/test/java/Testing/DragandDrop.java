
package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://online.roboform.com/site/signup");
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		//find source and target webelement
		WebElement Source=driver.findElement(By.id("box6"));
		WebElement Target=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver); //Action is interface and Actions is class
		
		//dragAndDrop(SourceElement,TargetElement)
		act.dragAndDrop(Source, Target).perform();

	}

}
