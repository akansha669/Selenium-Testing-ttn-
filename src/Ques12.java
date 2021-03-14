import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ques12 {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebElement box = driver.findElement(new By.ById("email_create"));
        box.sendKeys("akansha.singh@tothenew.com");
        driver.findElement(new By.ById("SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.name("customer_firstname")).sendKeys("Akansha");
        driver.findElement(By.name("customer_lastname")).sendKeys("Singh");
        driver.findElement(By.name("email")).sendKeys("akansha.singh@tothenew.com");
    }
}
