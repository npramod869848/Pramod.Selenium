package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;

public class GetColorBorderElement {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Configure Firefox to run in headless mode (optional)
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.id("credit-shellBtnID"));
        String bgcolor = button.getCssValue("background");

        String[] splitValue = bgcolor.split("none");
        String actualBgcolorRGB = splitValue[0];
        String expectedBgcolorRGB = getBGColor("RGB_Verify", "Blue");

        if (actualBgcolorRGB.equals(expectedBgcolorRGB)) {
            System.out.println("..True.. Actual and Expected bgcolor is matched");
        } else {
            System.out.println("..False.. Actual and Expected bgcolor is not matched");
        }

        WebElement bordercolo = driver.findElement(By.xpath("//div[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[1]/a"));
        String actualBorderColor = bordercolo.getCssValue("border-color");

        String expectedBorderColor = getBorderColor("RGB_Verify", "Blue");

        if (actualBorderColor.equals(expectedBorderColor)) {
            System.out.println("..True.. Actual and Expected border color is matched");
        } else {
            System.out.println("..False.. Actual and Expected border color is not matched");
        }

        WebElement textcolo = driver.findElement(By.xpath("//div[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[1]/a"));
        String actualTextColor = textcolo.getCssValue("color");

        String expectedTextColor = getFontColor("RGB_Verify", "Blue");

        if (actualTextColor.equals(expectedTextColor)) {
            System.out.println("..True.. Actual and Expected Font color is matched");
        } else {
            System.out.println("..False.. Actual and Expected Font color is not matched");
        }

        // Close the browser gracefully
        driver.quit();
    }

    // Define your method outside the main method
    public static String getBGColor(String strTitle, String strKey) {
        HashMap<String, String> hm = new HashMap<String, String>();
        if (strTitle.equals("RGB_Verify")) {
            hm.put("Blue", "rgb(255, 255, 255)");
        } else if (strTitle.equals("Hexadecimalcode_verify")) {
            hm.put("Blue", "#228EE9");
        }

        // Your method logic here
        return hm.get(strKey);
    }

    // Define a similar method for border color and font color
    public static String getBorderColor(String strTitle, String strKey) {
        HashMap<String, String> hm = new HashMap<String, String>();
        // Add mapping for border colors
        
        // Your method logic here
        return hm.get(strKey);
    }

    public static String getFontColor(String strTitle, String strKey) {
        HashMap<String, String> hm = new HashMap<String, String>();
        // Add mapping for font colors
        // Your method logic here
        return hm.get(strKey);
    }
}
