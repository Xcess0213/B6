package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW {
    public static void main(String[] args) throws InterruptedException {
   //     https://demo.seleniumeasy.com/input-form-demo.html

//        Fill the form and submit form for the website above!
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(" https://demo.seleniumeasy.com/input-form-demo.html");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Joe");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Pesci");

        WebElement emailInput = driver.findElement(By.cssSelector("input[name='email']"));
        emailInput.sendKeys("abc123@gmail.com");

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
        phoneNumber.sendKeys("1234567890");

        WebElement addressInput = driver.findElement(By.cssSelector("input[name='address']"));
        addressInput.sendKeys("123 abc St.");

        WebElement cityInput = driver.findElement(By.cssSelector("input[name='city']"));
        cityInput.sendKeys("Brooklyn");

        WebElement stateDropdown = driver.findElement(By.cssSelector("[name='state']"));
        Select selectState = new Select(stateDropdown);
        selectState.selectByVisibleText("New York");

        WebElement zipInput = driver.findElement(By.cssSelector("input[name='zip']"));
        zipInput.sendKeys("11229");

        WebElement websiteInput = driver.findElement(By.cssSelector("input[name='website']"));
        websiteInput.sendKeys("https://www.google.com/");

        WebElement hostingRadio = driver.findElement(By.cssSelector("input[name='hosting']"));
        hostingRadio.click();

        WebElement projectDescription = driver.findElement(By.cssSelector("textarea[name='comment']"));
        projectDescription.sendKeys("I would like to login into the Application with valid email and password");

        WebElement sendButton =  driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        sendButton.click();

        driver.quit();

    }
}
