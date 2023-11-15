package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementByText {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.findElement(By.xpath("//*[text()='Sell']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Ship')]")).click();

        // to find an element without inspect

        //xpath  //tagName[@attribute = 'value']
        //       //*[text()= 'News']
        //       //*[contains(text(), 'News')]


    }
}
