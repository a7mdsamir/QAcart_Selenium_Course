package openingBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeBrowserUsingDriver {
    public static void main(String[] args) {
        System.out.println("Hello selenium");
      //  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);


    }
}
