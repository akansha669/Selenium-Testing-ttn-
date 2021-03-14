import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
public class Ques4_2 {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.tothenew.com/");
        driver.findElement(new By.ByXPath("//*[@id=\"popup-buttons\"]/button[2]")).click();
        try {
            driver.findElement(new By.ById("#h-contact-us")).click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
