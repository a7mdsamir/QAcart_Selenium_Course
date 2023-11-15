package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("file://D:\\ahmed\\New\\Automation Courses\\Selenium Java course in Arabic QAcart\\QAcart_Selenium_Course\\src\\test\\resources\\index.html");
        driver.manage().window().maximize();

        String elemntText1 = driver.findElement(By.id("welcome")).getText();
        System.out.println("elemntText1 is : " + elemntText1);
        String elemntText2 = driver.findElement(By.name("desc")).getText();
        System.out.println("elemntText2 is : " + elemntText2);
        String elemntText3 = driver.findElement(By.className("about")).getText();
        System.out.println("elemntText3 is : " + elemntText3);
        //String elemntText4 = driver.findElement(By.className("list1 web")).getText();
        //System.out.println(elemntText4);   Compound class
        String elemntText4 = driver.findElement(By.className("list1")).getText();
        System.out.println("elemntText4 is : " + elemntText4);
        String elemntText5 = driver.findElement(By.tagName("li")).getText();
        System.out.println("elemntText5 is : " + elemntText5); // not used becasue tagName repeated , retrieve first one
        String elemntText6 = driver.findElement(By.linkText("Go to About Page")).getText();
        System.out.println("elemntText6 is : " + elemntText6);
        String elemntText7 = driver.findElement(By.partialLinkText("About Pag")).getText();
        System.out.println("elemntText7 is : " + elemntText7); // don't enter all linkText
        String elemntText8 = driver.findElement(By.xpath("/html/body/ul[2]/li[2]")).getText();
        System.out.println("elemntText8 is : " + elemntText8); // Absolute Xpath
        String elemntText9 = driver.findElement(By.xpath("//ul[@class='country-list']/li[2]")).getText();
        System.out.println("elemntText9 is : " + elemntText9); // Relative Xpath
        String elemntText10 = driver.findElement(By.xpath("//ul[contains(@class, 'country-')]/li[2]")).getText();
        System.out.println("elemntText10 is: " + elemntText10); // Xpath contains
        String elemntText11 = driver.findElement(By.xpath("//*[@class= 'country-list']/li[2]")).getText();
        System.out.println("elemntText11 is: " + elemntText11); // Xpath general tagName
        String elemntText12 = driver.findElement(By.xpath("//*[text() = 'Netherldans']")).getText();
        System.out.println("elemntText12 is: " + elemntText12); // Xpath text
        String elemntText13 = driver.findElement(By.xpath("//*[contains(text() , 'Nether')]")).getText();
        System.out.println("elemntText13 is: " + elemntText13); // Xpath text + contains
        String elemntText14 = driver.findElement(By.xpath("//*[@data-testid= 'welcome-header']")).getText();
        System.out.println("elemntText14 is: " + elemntText14); // Xpath data test id
        String elemntText15 = driver.findElement(By.cssSelector("#welcome")).getText();
        System.out.println("elemntText15 is: " + elemntText15); // cssSelector "#ID"
        String elemntText16 = driver.findElement(By.cssSelector(".list1")).getText();
        System.out.println("elemntText16 is: " + elemntText16); // cssSelector ".className"
        String elemntText17 = driver.findElement(By.cssSelector("[data-testid= \"welcome-header\"]")).getText();
        System.out.println("elemntText17 is: " + elemntText17); // cssSelector "[attribute= "value"]" OR "[attribute= value]"
        String elemntText18 = driver.findElement(By.cssSelector(".course-list .list2")).getText();
        System.out.println("elemntText18 is: " + elemntText18); // cssSelector ".className(parent) .className(child)"
        String elemntText19 = driver.findElement(By.cssSelector(".course-list li:nth-of-type(7)")).getText();
        System.out.println("elemntText19 is: " + elemntText19); // cssSelector ".className tagName:nth-of-type(num of element)"

        By welcomeHeader1 = By.id("welcome") ;
        String elemntText20 = driver.findElement(welcomeHeader1).getText();
        System.out.println("elemntText20 is : " + elemntText20);

        WebElement welcomeHeader2 = driver.findElement(By.id("welcome")) ;
        String elemntText21 = welcomeHeader2.getText();
        System.out.println("elemntText21 is : " + elemntText21);

        String elemntText22 = driver.findElements(By.cssSelector(".course-list li")).get(7).getText();
        System.out.println("elemntText22 is : " + elemntText22);

        List<WebElement> list = driver.findElements(By.cssSelector(".course-list li")) ;
        System.out.println("size of list is : " + list.size());

        /*
        Relative Xpath
        //tagName[@attribute = 'value']     OR   //*[@attribute = 'value']
        $x("    //h1[@id='welcome']     ")
        $x("//h1")                         all h1
         */
        /*
        Absolute Xpath
        $x("//html/body/ul[2]/li[2]")      move to 2nd drop down list, then to 2nd choice
        $x("//html/body/h1")               first h1
         */
        /*
        cssSelector
        $(  "#ID"    )
        $(  ".className"    )
        $(  "[attribute= "value"]"     )
        $(  ".className(parent) .className(child)"      )
        $(  ".className(parent) > .className(child)"    ) in case direct parent
        $(  ".className tagName:nth-of-type(num of element)"    )

         */
        driver.quit();



    }
}
