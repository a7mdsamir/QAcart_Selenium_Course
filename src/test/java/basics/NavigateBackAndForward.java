package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateBackAndForward {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://qacart.com/ar");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
