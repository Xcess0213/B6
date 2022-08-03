package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _03_Task_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");


        driver.switchTo().frame("frame2");


        WebElement dropdownAnimal = driver.findElement(By.id("animals"));

        Select select = new Select(dropdownAnimal);
        select.selectByVisibleText("Avatar");



    }

}
