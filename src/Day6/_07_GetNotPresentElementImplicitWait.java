package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _07_GetNotPresentElementImplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //  Implicit wait, will wait for 10 seconds before throwing noSuchElementException
        //  but during that 10 seconds selenium will keep trying to find the element
        // and if Selenium finds the element after 3 seconds, the 7 seconds will not be wasted!!
        // Because the scrip will continue after finding element

        //If the element is never found, it will not wait forever, it will just wait for 10 seconds

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();



        WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
        String text = textElement.getText();
        System.out.println(text);

        driver.quit();
    }
}
