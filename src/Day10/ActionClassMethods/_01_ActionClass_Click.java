package Day10.ActionClassMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class _01_ActionClass_Click {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);
        actions.click(clickMe).perform();

        WebElement textAfterClick = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(textAfterClick);

        driver.quit();




    }
}
