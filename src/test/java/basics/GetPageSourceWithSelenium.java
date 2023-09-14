package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleSelenium {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://qacart.com/ar");

        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("Title is " + title);
    }
}
