package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteractions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.udemy.com/");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement textBox = driver.findElement(By.cssSelector("[data-testid= \"search-input\"]"));
        action.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("ahmed").build().perform(); //shift click

        action.sendKeys(Keys.TAB).build().perform(); // tab click
        action.sendKeys(Keys.ENTER).build().perform(); // enter click

    }}