import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Ques1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/usr/local/share/gecko_driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Try to Fetch the alert popup text.
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
        String str = driver.switchTo().alert().getText();
        System.out.println("\nAlert Box Text : "+str);
        driver.switchTo().alert().accept();
        //Try to dismiss the popup.
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        driver.switchTo().alert().dismiss();
        //Try to enter some data on an alert popup.
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
        driver.switchTo().alert().sendKeys("Prompt Box");
        driver.switchTo().alert().accept();
        //TryTry to accept the popup.
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        driver.switchTo().alert().accept();

    }
}
