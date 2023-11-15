package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class ListSearchSuggestion {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com.eg/?hl=ar");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.className("gLFyf")).sendKeys("hyg");
        Thread.sleep(5000);
        WebElement list = driver.findElement(By.xpath("//ul[@role='listbox']"));
        List <WebElement> sug = list.findElements(By.tagName("span"));


        for (int i = 0; i < sug.size(); i++) {
            System.out.println(sug.get(i).getText());        }



    }
}