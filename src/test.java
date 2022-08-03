import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mir_m\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/%22");
                driver.manage().window().maximize();



        String name = "Teddy bear";
        WebElement searchTeddyBear = driver.findElement(By.cssSelector("input[class='col-xs-20 searchformInput keyword']"));
        searchTeddyBear.sendKeys(name);

        Thread.sleep(2000);

        WebElement clickSearch = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
       clickSearch.click();

        WebElement searchResult = driver.findElement(By.cssSelector("div [class='nnn']"));
        String str = searchResult.getText();
        System.out.println(str);



    }
}
