package Day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver_Check {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\mir_m\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://campus.techno.study/");

        
    }
}

