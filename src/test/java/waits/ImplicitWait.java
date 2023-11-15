package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        // Thread.sleep(10000); always wait 10 sec even element was shown
        // implicit wait waits 10 sec only if element was hidden
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("[class= \"button primary\"]")).click();

        driver.findElement(By.cssSelector("[class= \"button secondary\"]")).click();
        // </button> is not clickable at point... Other element would receive the click

        /*
        Thread.sleep    java      static
        implicit wait   selenium  dynamic   global
        explicit wait   selenium  dynamic   private
         */
    }
}
