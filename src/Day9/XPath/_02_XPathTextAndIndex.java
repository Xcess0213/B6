package Day9.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_XPathTextAndIndex {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locating element using their text!
        WebElement header = driver.findElement(By.xpath("//p[text()='Learn skills to launch a tech career in 6 months']"));
        String headerText = header.getText();

        // Locating element using contains (contains can work with text and attributes)
        WebElement header2 = driver.findElement(By.xpath("//p[contains(text(),'mentorship')]"));
        String header2Text = header2.getText();


        // Locating element by index
        // When your locator finds more than 1 element you can use index to select specific one
        WebElement enrollNowButton = driver.findElement(By.xpath("(//span[text()='Enroll now'])[2]"));

    }
}
