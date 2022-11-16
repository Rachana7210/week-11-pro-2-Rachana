import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser  = "chrome";
    static String baseurl = "https://opensource-demo.orangehrmlive.com";
    static WebDriver driver;

    public static void main(String[] args) {
        //1)setup of browser

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdiver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdiver.msedge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        //2)open url
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3)print the title of the edge
        System.out.println("Title of the page is" + driver.getTitle());

        //4)print current url
        System.out.println("Current url is" + driver.getCurrentUrl());

        //5)print the page saurce
        System.out.println("page source is" + driver.getPageSource());

        //6)Find and enter username field
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        //7)find and enter password field
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(" admin123");

        //8)close the browser
        driver.quit();


    }

    }
