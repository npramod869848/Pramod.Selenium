package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.ArrayList;
import java.util.List;

public class LNG {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
        List<String> texts = new ArrayList<>();

        for (WebElement ele : elements) {
            String str = ele.getText();
            texts.add(str);  // Store the text in a list
            // Or perform some other action with the text
        }

        // Use the 'texts' list as needed
    }
}
