package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectFromDropdown {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("file://D:\\ahmed\\New\\Automation Courses\\Selenium Java course in Arabic QAcart\\QAcart_Selenium_Course\\src\\test\\resources\\index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Select dropDown = new Select(driver.findElement(By.id("courses")));
        //dropDown.selectByIndex(1); //OR
        //dropDown.selectByValue("selenium");  //OR
        dropDown.selectByVisibleText("selenium");



    }
}
