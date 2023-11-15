package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseInteractions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.udemy.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions action = new Actions(driver);
        WebElement cart = driver.findElement(By.cssSelector("[class= \"ud-icon ud-icon-medium ud-icon-color-neutral\"]"));
        action.moveToElement(cart).build().perform(); // stop with the mouse on category btn
        action.moveToElement(cart).contextClick().build().perform(); // rightClick
        Thread.sleep(10000);

        WebElement textBox = driver.findElement(By.cssSelector("[data-testid= \"search-input\"]"));
        action.moveToElement(textBox).click().sendKeys("ahmed").doubleClick().build().perform(); // doubleClick

    }}


