import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Ques4 {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.tothenew.com/");
        driver.findElement(new By.ByXPath("//*[@id=\"popup-buttons\"]/button[2]")).click();
        driver.findElement(new By.ByXPath("/html/body/div[1]/div/header[2]/div/div/div/nav/div[2]/ul/li[7]/a")).click();
    }

}
