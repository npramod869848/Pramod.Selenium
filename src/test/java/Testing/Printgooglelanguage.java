package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printgooglelanguage {
    public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // Navigate to Google's homepage
        driver.get("https://www.google.com/");

        // Find the language settings link and click on it
        WebElement languageSettingsLink = driver.findElement(By.linkText("Settings"));
        languageSettingsLink.click();

        // Find the search settings link and click on it
        WebElement searchSettingsLink = driver.findElement(By.linkText("Search settings"));
        searchSettingsLink.click();

        // Find the language dropdown and click on it
        WebElement languageDropdown = driver.findElement(By.id("lr_button"));
        languageDropdown.click();

        // Find and print the available languages
        WebElement languagesContainer = driver.findElement(By.id("lr_popup"));
        System.out.println("Languages offered by Google:");
        System.out.println(languagesContainer.getText());

        // Close the browser
        driver.quit();
    }
}
