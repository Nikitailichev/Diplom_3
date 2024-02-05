package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrivers {
    public WebDriver getDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/Users/nikitita.i/Desktop/WebDriver/bin/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("force-device-scale-factor=0.75");
                options.addArguments("high-dpi-support=0.75");
                return new ChromeDriver(options);
            case FIREFOX:
                return new FirefoxDriver();
            case YANDEX:
                System.setProperty("webdriver.chrome.driver", "/Users/nikitita.i/Desktop/Diplom/Diplom_3/src/main/resources/Yandex");
                ChromeOptions optionsYandex = new ChromeOptions();
                optionsYandex.addArguments("--start-maximized");
                optionsYandex.addArguments("--remote-allow-origins=*");
                optionsYandex.addArguments("force-device-scale-factor=0.75");
                optionsYandex.addArguments("high-dpi-support=0.75");
                return new ChromeDriver(optionsYandex);
            default:
                throw new RuntimeException("Browser undefined");
        }
    }
}