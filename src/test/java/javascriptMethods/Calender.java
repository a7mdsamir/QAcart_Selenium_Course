package javascriptMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.agoda.com/country/egypt.html?cid=1844104");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement cIN = driver.findElement(By.className("ficon IconBox__icon ficon-20 ficon-check-in"));
        WebElement cOUT = driver.findElement(By.className("IconBox IconBox--checkOut"));


        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('data-date', '"+"2023-11-14"+"')", cIN);
        js.executeScript("arguments[0].setAttribute('data-date', '"+"2023-11-18"+"')", cOUT);

    }
}