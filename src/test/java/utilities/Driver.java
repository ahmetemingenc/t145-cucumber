package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    static WebDriver driver;

    public static WebDriver getDriver() {

        String usedBrowser = ConfigurationReader.getProperty("browser");

        if (driver == null) {

            switch (usedBrowser) {

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();

                default:
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}
