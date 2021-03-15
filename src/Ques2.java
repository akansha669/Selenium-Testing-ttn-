import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ques2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Validate that Multi-Select List Demo is a multiple dropdown
        Select select=new Select(driver.findElement(By.id("multi-select")));
        System.out.println("Dropdown is multi-select: "+select.isMultiple());
        //Fetch all the dropdown options
        System.out.println("All the data in dropDown are: ");
        List<WebElement> list=select.getOptions();
        int size=list.size();
        for(int i=0;i<size;i++){
            String options = list.get(i).getText();
            System.out.println(options);
        }
        //Select New Jersey>New York>Texas then fetch last selected option & all selected options.
        select.selectByValue("New Jersey");
        select.selectByValue("New York");
        select.selectByValue("Texas");
        driver.findElement(By.id("printMe")).click();

        String last=driver.findElement(By.className("getall-selected")).getText();
        System.out.println("\n Last selected option is: "+last);
        System.out.println("\nFirst seletced option is :"+ select.getFirstSelectedOption().getText());
        System.out.println("\n All selected options are:");
        List<WebElement> op1 = select.getAllSelectedOptions();
        int size1 = op1.size();
        for(int i =0; i<size1 ; i++){
            String options = op1.get(i).getText();
            System.out.println(options);
        }
        //Deselect all the selected options.
         select.deselectAll();
        driver.quit();


    }
}
