package Day9.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_XPathSimpleSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccountButton.click();

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys("Mario");

        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
        genderRadioButton.click();

        driver.quit();
    }
}
