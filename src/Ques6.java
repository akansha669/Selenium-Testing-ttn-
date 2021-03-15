import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ques6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/usr/local/share/gecko_driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("messageWindowButton")).click();
        String MainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println("Title of child window : "+driver.getTitle());
                System.out.println("Text in child window : \n"+driver.findElement(By.tagName("body")).getText());
                driver.close();
                System.out.println("Child window closed");
            }
        }
        driver.switchTo().window(MainWindow);
        System.out.println("Back to Main Window");


    }
}
