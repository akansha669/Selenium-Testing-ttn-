import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ques4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Entering value in single Iframe
        driver.findElement(By.linkText("Single Iframe")).click();
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("//div['col-xs-6']/input")).sendKeys("Value in single iFrame");
        driver.switchTo().parentFrame();

        //Entering value in single Iframe within Iframe
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div['col-xs-6']/input")).sendKeys("Value in single iFrame");
        driver.switchTo().parentFrame();

        driver.quit();



    }
}
