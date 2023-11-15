package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;


public class FindElementByAll {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(new ByAll(By.id("email"), By.name("email"))).sendKeys("ahmed");
        // to find an element by locator A OR locator B locator C

        driver.findElement(new ByChained(By.className("_6ltg"), By.name("login"))).click();
        // to find an element by his parent , ( parent written first )

        driver.findElement(new ByIdOrName("pass")).sendKeys("ahmed");
        // to find an element by Id OR Name


    }
}
