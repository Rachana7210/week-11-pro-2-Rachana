import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Watchable;
import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String  url = "https://opensource-demo.orangehrmlive.com";

        //Ser Firefox driver path
        System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");

        //Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page title is:" + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Find and enter username in username field
        WebElement usernameField = driver.findElement(By.name("Username"));
        usernameField.sendKeys("Admin");

        //Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("admin123");

        //Close browser
        driver.quit();

    }
}
