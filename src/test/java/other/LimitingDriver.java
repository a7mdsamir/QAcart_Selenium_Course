package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LimitingDriver {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.bbc.com/");

        driver.manage().window().maximize();

        // to calc num of links in footer
        // hint * links in inspection like this "<a href="https://www.bbc.com/" >"
        WebElement footer = driver.findElement(By.className("orb-footer-primary-links"));
        System.out.println("URLs in footer is " + footer.findElements(By.tagName("a")).size());
        System.out.println("URLs in page is " + driver.findElements(By.tagName("a")).size());

    }
}
