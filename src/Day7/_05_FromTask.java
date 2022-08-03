package Day7;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _05_FromTask {
    public static void main(String[] args) {
        // ---    TASK    ---
        // Navigate https://www.facebook.com/
        // Click on Create New Account button
        // Fill the form
        // Get text for Sign Up button

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createAccButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccButton.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("john");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameInput.sendKeys("Shaw");

        WebElement emailInput = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        emailInput.sendKeys("abc@gmail.com");

        WebElement reenterEmailInput = driver.findElement(By.cssSelector("input[data-type='password']"));
        reenterEmailInput.sendKeys("abc@gmail.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[type='password']"));
        passwordInput.sendKeys("Abc123");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("May");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1999");

        WebElement maleOptionRadioButton = driver.findElement(By.cssSelector("input[value='2']"));
        maleOptionRadioButton.click();

        WebElement signUpButton = driver.findElement(By.cssSelector("button[name='websubmit']"));
        String signUpButtonText = signUpButton.getText();
        System.out.println(signUpButtonText);

        driver.quit();











    }
}
