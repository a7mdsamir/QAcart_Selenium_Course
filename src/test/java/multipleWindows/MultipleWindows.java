package multipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;


public class MultipleWindows {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        String parent = driver.getWindowHandle();
        System.out.println("WindowHandle for parent is " + parent);
        //System.out.println("WindowHandle for parent is " + driver.getWindowHandle());

        driver.findElement(By.cssSelector("[class= \"button youtube\"]")).click();
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        for(String windowHandle : allWindows){
            if(!windowHandle.equalsIgnoreCase(parent)){
                System.out.println(driver.getTitle());
                driver.switchTo().window(windowHandle);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        //driver.close();  close only window you in
        //driver.quit();     close all windows
        driver.switchTo().window(parent); // lazem n3ml switch even hwa wa2ef 3aleha (parent)
        driver.findElement(By.cssSelector("[class= \"button linkedin\"]")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();



    }}
