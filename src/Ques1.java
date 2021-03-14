import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/usr/local/share/gecko_driver/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com/");
    }
}
