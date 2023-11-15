package visitingWebsites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenHTMLFile {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("file://D:\\ahmed\\New\\Automation Courses\\Selenium Java course in Arabic QAcart\\QAcart_Selenium_Course\\src\\test\\resources\\index.html");

    }
}
