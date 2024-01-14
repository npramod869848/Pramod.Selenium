package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://objectspy.space/");
    }

    @Test
    public void dropdown() {
        WebElement contentsElement = driver.findElement(By.xpath("//select[@id=\"continents\"]"));

        Select sel = new Select(contentsElement);
       // sel.selectByVisibleText("Antartica");
       // sel.selectByIndex(1);

        List<WebElement> elements = sel.getOptions();

        // Get the length
        System.out.println("Element Total size is: " + elements.size());

        // Printing each element one by one
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }

     // Element you want to check for
        String elementToCheckFor = "Antartica";    //"Desired Text or Attribute Value";
        
        boolean isElementAvailable = false;
        
       // Iterate through the list of elements
        for (WebElement element : elements) 
        {
            if (element.getText().equals(elementToCheckFor)) 
            {
                isElementAvailable = true;
                break; // Found the element, no need to continue searching
            }
        }
        
        // Check if the element is available
        if (isElementAvailable) 
        {
            System.out.println("Element is available in the list.");
        } 
        else 
        {
            System.out.println("Element is not available in the list.");
        }
        
        
        // Close the WebDriver
        driver.quit();
    }
}
