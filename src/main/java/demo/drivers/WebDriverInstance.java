package demo.drivers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class WebDriverInstance {
    public static WebDriver driver;

    public static void initialize(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void quit(){
        driver.quit();
    }
}
