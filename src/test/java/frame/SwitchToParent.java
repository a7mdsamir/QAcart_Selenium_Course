package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SwitchToParent {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");

        WebElement frame = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("actions-button")).click();

        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.className("logo")).getText());


        /*
        driver.switchTo().defaultContent();    to back to the main frame
         */
    }
}
