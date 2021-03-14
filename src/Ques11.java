import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Ques11 {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebElement box = driver.findElement(new By.ById("email_create"));
        box.sendKeys("akansha.singh@tothenew.com");
        driver.findElement(new By.ById("SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //gender
        driver.findElement(new By.ById("id_gender1")).click();
        //firstname
        driver.findElement(By.name("customer_firstname")).sendKeys("Akansha");
        //lastname
        driver.findElement(By.name("customer_lastname")).sendKeys("Singh");
        //Password
        driver.findElement(new By.ByXPath("//*[@id=\"passwd\"]")).sendKeys("eep@123");
        //Date Of Birth
        Select country=new Select(driver.findElement(By.name("days")));
        country.selectByIndex(7);
        Select country2=new Select(driver.findElement(By.name("months")));
        country2.selectByIndex(1);
        Select country3=new Select(driver.findElement(By.name("years")));
        country3.selectByValue("1996");
        //company
        driver.findElement(By.name("company")).sendKeys("None");
        //Address1
        driver.findElement(By.name("address1")).sendKeys("H.No-74,hdhdsah street");
        //Address2
        driver.findElement(By.name("address2")).sendKeys("New Goregaon,Mahuli");
        //city
        driver.findElement(new By.ById("city")).sendKeys("Mahuli");
        //state
        Select state=new Select(driver.findElement(By.name("id_state")));
        state.selectByIndex(1);
        //zipcode
        driver.findElement(new By.ById("postcode")).sendKeys("12345");
        //Additional info
        driver.findElement(new By.ById("other")).sendKeys("Nothing");
        //Home Phone
        driver.findElement(new By.ById("phone")).sendKeys("963523764");
        //mobile Phone
        driver.findElement(new By.ById("phone_mobile")).sendKeys("963523764");
        //Alias
        driver.findElement(new By.ById("alias")).sendKeys("nothing");
        //Register
        driver.findElement(new By.ByXPath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click();
        //Validate the text on the page. "CREATE AN ACCOUNT"
        String expectedText= "CREATE AN ACCOUNT";
        String actualText=driver.findElement(By.id("create-account_form"))
                .findElement(By.className("page-subheading")).getText();
        System.out.println(actualText.equals(expectedText));
        //Validate that the title is  - "Login - My Store"
        String expectedTitle= "Login - My Store";
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle));
    }
}
