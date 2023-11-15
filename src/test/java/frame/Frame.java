package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Frame {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");
        /*
        The 1st way using ID or name
        driver.switchTo().frame("qacart");
        driver.findElement(By.id("actions-button")).click();

         */
        // The 2nd way using WebElement
        // in case frame hasn't <id> or <name>, find it by xpath
        WebElement frame = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(frame);

        driver.findElement(By.id("actions-button")).click();



}}
