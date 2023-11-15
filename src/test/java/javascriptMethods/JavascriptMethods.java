package javascriptMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptMethods {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com/forms/about/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement goToForms = driver.findElement(By.className("pricing-plans-see-more"));
        //goToForms.click();

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", goToForms);
        //js.executeScript("alert('"+"ahmed"+"')");  to show an alert with a message
        js.executeScript("arguments[0].style.border='3px solid red'", goToForms);
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", goToForms);

    }
}
