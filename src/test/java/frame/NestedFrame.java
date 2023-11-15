package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class NestedFrame {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");

        driver.switchTo().frame("menu");
        driver.switchTo().frame("links");
        //System.out.println(driver.findElement(By.id("welcome")).getText());
        System.out.println(driver.findElement(By.cssSelector("[class= \"button windows\"]")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("qacart");
        driver.findElement(By.id("actions-button")).click();



    }
}
