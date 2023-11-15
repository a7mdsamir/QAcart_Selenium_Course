package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ClickSelenium {

           public static void main(String[] args) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            ChromeDriver driver = new ChromeDriver(options);

            /*
            // We use get method yo open any web page
            driver.get("https://qacart.com");
               driver.manage().window().maximize();
           // driver.findElement(By.cssSelector("[class=lw-topbar-hamburger-button]")).sendKeys("a99samir99@gmail.com");
            driver.findElement(By.xpath("//*[@id='menuItem_1634680565427_1193']")).click();
              // System.out.println("done1");
            driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("a99samir99@gmail.com");
             //  System.out.println("done2");
            driver.findElement(By.xpath("//*[@type='password']")).sendKeys("a99samir99@gmail.com");
            driver.findElement(By.xpath("//*[@class='btn-lbl']")).click();
            */
               driver.get("https://todo.qacart.com/login");
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
               driver.findElement(By.xpath("//*[@class='sc-bZkfAO ljiFAW']")).click();
                System.out.println("login btn - done");
                // isDisplayed
               boolean emailIsDisplayed = driver.findElement(By.cssSelector("[data-testid=\"email\"]")).isDisplayed();
                System.out.println("emailIsDisplayed " + emailIsDisplayed);
               // isEnabled
               boolean emailIsEnabled = driver.findElement(By.cssSelector("[data-testid=\"email\"]")).isEnabled();
               System.out.println("emailIsEnabled " + emailIsEnabled);

               driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("a99samir99@gmail.com");
                 System.out.println("username - done");
               driver.findElement(By.xpath("//*[@data-testid='password']")).sendKeys("A7md@samir");
               System.out.println("password - done");
               driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();
               // check box
               driver.findElement(By.xpath("//*[@data-testid='complete-task']")).click();
               // isSelected
               boolean checkBox = driver.findElement(By.xpath("//*[@data-testid='complete-task']")).isSelected();
               System.out.println("checkBoxIsSelected " + checkBox);
               // Get Attribute
               String attribute = driver.findElement(By.xpath("//*[@data-testid='complete-task']")).getAttribute("name");
               System.out.println("attribute(name) of check box " + attribute);
               // Get tagName
               String tagName = driver.findElement(By.xpath("//*[@data-testid='complete-task']")).getTagName();
               System.out.println("tagName " + tagName);
               // Get CSS value
               String CSSvalue = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getCssValue("background-color");
               System.out.println("CSSvalue (background-color) " + CSSvalue);
               // Get location
               Point location = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getLocation();
               System.out.println("location " + location); // location.x .y
               // Get size
               Dimension size = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getSize();
               System.out.println("size " + size);  // size.width .height
               // Get rectangle
               Rectangle rectangle = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getRect();
               System.out.println("rectangle " + rectangle.width);  //  rectangle.width .height .x .y

               // Get areaRole (text box , button , link , ... )
               String areaRole = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getAriaRole();
               System.out.println("areaRole " + areaRole);
               // Get accessible
               String accessibleName = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getAccessibleName();
               System.out.println("accessibleName " + accessibleName);



           }
    }