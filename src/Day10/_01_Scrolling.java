package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_Scrolling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down 3000 pixels
        js.executeScript("window.scrollBy(0,3000)");


        // Scroll up -2000 pixels
        js.executeScript("window.scrollBy(0,-2000)");

    }
}
