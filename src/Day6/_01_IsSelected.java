package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_IsSelected {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        Thread.sleep(3000);

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));

        boolean beforeClickOnCheckbox = checkBox.isSelected();

        checkBox.click();

        Thread.sleep(3000);

        boolean afterClickOnCheckbox = checkBox.isSelected();

        System.out.println("Before click: " + beforeClickOnCheckbox);
        System.out.println("After click: " + afterClickOnCheckbox);

        driver.quit();
    }
}
