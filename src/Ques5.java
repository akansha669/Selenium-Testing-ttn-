import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ques5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Print the count of frames on this application.
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Number of frames: "+size);
        //Print and switch to inner iframe
        driver.switchTo().frame(2);
        int sz=driver.findElements(By.tagName("iframe")).size();
        System.out.println("No. of frames inside frame-2 are : "+sz);
        driver.switchTo().parentFrame();
        driver.quit();
    }
}
