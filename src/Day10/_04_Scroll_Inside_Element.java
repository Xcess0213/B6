package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Scroll_Inside_Element {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement divWrapper = driver.findElement(By.className("wrapper"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // with this we can scroll horizontally and inside an element
        js.executeScript("arguments[0].scrollBy(200,0)", divWrapper);

        driver.quit();

    }
}
