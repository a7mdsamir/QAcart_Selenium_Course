package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Alert {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/alert.html");
        driver.findElement(By.cssSelector("[class= \"button alert\"]")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.cssSelector("[class= \"button prompt\"]")).click();
        //Thread.sleep(2000);
        //System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("ahmed");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
}}
