package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceWithSelenium {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://qacart.com/ar");

        driver.manage().window().maximize();

        String pageSource = driver.getPageSource();
        System.out.println("PageSource is " + pageSource);
    }
}
