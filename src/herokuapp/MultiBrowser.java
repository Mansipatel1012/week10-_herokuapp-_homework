package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // find the  username field element
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("herok@gmail.com");
        // find the password field element
        driver.findElement(By.name("password")).sendKeys("herok1234");
        // closing browser
        driver.close();
    }

}
