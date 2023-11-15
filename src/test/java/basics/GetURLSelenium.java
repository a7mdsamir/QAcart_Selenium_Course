package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetURLSelenium {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.selenium.dev/");

        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println("URL " + url);
    }
}
