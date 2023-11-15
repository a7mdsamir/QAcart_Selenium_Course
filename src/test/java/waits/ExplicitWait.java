package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //new WebDriverWait(driver, Duration.ofSeconds(5))
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class= \"button primary\"]"))).click();
        //driver.findElement(By.cssSelector("[class= \"button primary\"]")).click();

        //new WebDriverWait(driver, Duration.ofSeconds(8))
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));

        //new WebDriverWait(driver, Duration.ofSeconds(8))
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));
        driver.findElement(By.cssSelector("[class= \"button secondary\"]")).click();

    }}
