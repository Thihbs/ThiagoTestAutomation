package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

	public static WebDriver driver;

	public static void startChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/lib/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--test-type");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--enable-popup-blocking");
		chromeOptions.addArguments("--disable-infobars");
		chromeOptions.addArguments("--disable-default-apps");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--javascriptEnabled");
		chromeOptions.addArguments("--applicationCacheEnabled");
		chromeOptions.addArguments("--lang=pt-BR");
		chromeOptions.addArguments("--incognito");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
	}

	public static WebDriver getCurrentRunningDriver() {
		return driver;
	}

	public static void killCurrentRunningDriver() {
		driver.quit();
		
	}
}
