package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector("#column-a"));
        WebElement destination = driver.findElement(By.cssSelector("#column-b"));

        action.dragAndDrop(source, destination); //OR
        System.out.println("done1");
        action.clickAndHold(source).moveToElement(destination).release().build().perform();
        System.out.println("done2");

    }}
