package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_GetNotPresentElementThreadSleep {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        Thread.sleep(7000);

        // no such element exception because the element is not present in the website yet!!
        // when you get noSuchElement -> 1-check locator 2-you might need to wait
        WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
        String text = textElement.getText();
        System.out.println(text);

        driver.quit();


    }
}
