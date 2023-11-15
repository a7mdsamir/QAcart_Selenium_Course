package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitAndCloseInSelenium {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://qacart.com/ar");

        driver.manage().window().maximize();

        //driver.quit(); // close all windows and tabs
        driver.close();
    }
}
