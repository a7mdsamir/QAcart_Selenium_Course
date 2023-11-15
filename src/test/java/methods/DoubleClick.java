package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class DoubleClick {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://todo.qacart.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@class='sc-bZkfAO ljiFAW']")).click();
        System.out.println("login btn - done");

        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("a99samir99@gmail.com");
        System.out.println("username - done");
        driver.findElement(By.xpath("//*[@data-testid='password']")).sendKeys("A7md@samir");
        System.out.println("password - done");
        driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();

        // double click
        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(By.xpath("//*[@data-testid='complete-task']"))).perform();
        // OR
        Actions action1 = new Actions(driver);
        WebElement doubleClickButton = driver.findElement(By.xpath("//*[@data-testid='complete-task']"));
        action.doubleClick(doubleClickButton).perform();


        // right click
        Actions action2 = new Actions(driver);
        WebElement doubleClickButton2 = driver.findElement(By.xpath("//*[@data-testid='complete-task']"));
        action.contextClick(doubleClickButton2).perform();

    }}
