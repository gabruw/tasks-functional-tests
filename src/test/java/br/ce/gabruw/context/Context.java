package br.ce.gabruw.context;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Context {

    public static WebDriver accessApplication(long time) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", Params.CHROME_LOCAL);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to(Params.URL_LOCAL);
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

        return driver;
    }
}