import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ques2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
