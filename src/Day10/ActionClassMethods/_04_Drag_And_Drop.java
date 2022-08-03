package Day10.ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _04_Drag_And_Drop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement fiveThousandBtn = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
        WebElement debitAmount = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(fiveThousandBtn, debitAmount).perform();

        WebElement bankBtn = driver.findElement(By.id("credit2"));
        WebElement debitAcct = driver.findElement(By.id("bank"));

        actions.dragAndDrop(bankBtn, debitAcct).perform();



        driver.quit();
    }
}
