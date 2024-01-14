package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {
    public static void main(String[] args) {
    	
    	//1.Launch the browser and open the main window:
    	WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");

        // 2.Get the main window handle
        String mainWindowHandle = driver.getWindowHandle();
        
        //3.Perform an action that opens a new window:
// Click a link that opens a new window.This can be clicking a link, button, or any other interaction that opens a new window.
        driver.findElement(By.linkText("Open New Window")).click();

        //4.Switch to the new window
 //This loop iterates through each window handle in the set returned by getWindowHandles()       
        for (String windowHandle : driver.getWindowHandles()) {
//windowHandle is not equal to the mainWindowHandle. 
//This is done to identify the new window or tab, as the mainWindowHandle corresponds to the main window that was initially opened.
            if (!windowHandle.equals(mainWindowHandle)) {
//window handle is found that is not equal to the mainWindowHandle.
//driver.switchTo().window(windowHandle) statement is used to switch the driver's focus to that particular window.
                driver.switchTo().window(windowHandle);
//After successfully switching to the new window, the break statement is used to exit the loop.                
                break;
            }
        }

        //5.Perform actions in the new window
        driver.findElement(By.id("new-window-input")).sendKeys("Hello from the new window");

        //.Close the new window
        driver.close();

        //6.Switch back to the main window
        driver.switchTo().window(mainWindowHandle);

        //7.Continue working in the main window
        driver.findElement(By.id("main-window-input")).sendKeys("Hello from the main window");

        //8.Close the main window at the end of the test
        driver.quit();
    }
}
