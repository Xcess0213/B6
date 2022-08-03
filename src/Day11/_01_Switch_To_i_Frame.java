package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Switch_To_i_Frame {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        WebElement inputField = driver.findElement(By.tagName("input"));
        inputField.sendKeys("Hello World!");


    }
}
