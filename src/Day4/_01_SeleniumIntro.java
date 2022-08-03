package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_SeleniumIntro {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        // Define driver type and driver path (location)

         // Create a new WebDriver object
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to website
        driver.get("https://techno.study/");

        // Quit the browser
        driver.quit();

    }

}
