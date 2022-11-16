import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com";

        //Set chrom driver path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //start chrome browser
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is" + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page source is:" + driver.getPageSource());

        //find the web element for username field
        WebElement usernameField = driver.findElement(By.name("Username"));
        usernameField.sendKeys("Admin");

        //find the web element for password field
        WebElement passwordField = driver. findElement(By.name("Password"));
        passwordField.sendKeys("admin123");

        //Close browser
        driver.quit();
    }
}
