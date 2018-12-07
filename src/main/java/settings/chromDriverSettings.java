package settings;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromDriverSettings {

    public static void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amila\\IdeaProjects\\BDDTestProject\\src\\main\\java\\chromedriver.exe");

    }

    public static WebDriver loadGoogleHomePage() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        return webDriver;
    }
}
