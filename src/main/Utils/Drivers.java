package main.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {

    public static WebDriver getSeleniumDriver(String browserType)
    {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase("Firefox")) {

            driver = new FirefoxDriver();

        } else if (browserType.equalsIgnoreCase("InternetExplorer")) {


            driver = new InternetExplorerDriver();

        } else if (browserType.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
        return driver;
    }


}
