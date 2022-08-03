package Mentoring_Class.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FillingAForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver; // we will add this later

        WebElement agreeButton = driver.findElement(By.cssSelector("a[id='banner-accept']"));

         wait.until(ExpectedConditions.visibilityOf(agreeButton));
        agreeButton.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        firstNameInput.sendKeys("first name");

        WebElement lastNameInout = driver.findElement(By.cssSelector("input[name='lastname'"));
        lastNameInout.sendKeys("last name");

        WebElement femaleCheckBox = driver.findElement(By.cssSelector("input[value='Female']"));
        femaleCheckBox.click();

        WebElement dynamicColorButton = driver.findElement(By.cssSelector("button[id='dynamicColor']"));

        js.executeScript("arguments[0].scrollIntoView();", dynamicColorButton);


        WebElement experienceCheckBox = driver.findElement(By.cssSelector("input[value='4']"));
        experienceCheckBox.click();

        js.executeScript("window.scrollBy(0,500)");

        WebElement dateInput = driver.findElement(By.cssSelector("tr:nth-child(5)>td:nth-child(2)>input"));
        dateInput.sendKeys("01/18/2022");

        WebElement professionCheckBox = driver.findElement(By.cssSelector("input[value='Automation Tester']"));
        professionCheckBox.click();

        WebElement photo = driver.findElement(By.cssSelector("input[name='photo']"));
        photo.sendKeys("/Users/afranurmenemenli/Desktop/selenium-logo.png");

        WebElement flavorCheckBox = driver.findElement(By.cssSelector("input[value='Selenium Webdriver']"));
        flavorCheckBox.click();

        WebElement continentsDropdown = driver.findElement(By.cssSelector("select[name='continents']"));
        Select antartica = new Select(continentsDropdown);
        antartica.selectByVisibleText("Antartica");

        WebElement commandsDropdown = driver.findElement(By.name("selenium_commands"));
        Select browser = new Select(commandsDropdown);
        browser.selectByVisibleText("Browser Commands");

        WebElement submitButton = driver.findElement(By.cssSelector("button[name='submit']"));
        submitButton.click();

//        driver.switchTo().alert().accept();

        driver.quit();

    }
}
