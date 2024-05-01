package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.rmi.Remote;
import java.time.Duration;
//encapsulating from manipulation singleton
public class DriverHelper {
    public static WebDriver driver;

    private DriverHelper() {}


    public static WebDriver getDriver () {
        if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
            String browser = "chrome";

            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().deleteAllCookies();//will make automation fresh

        }
        return driver;
    }





}






