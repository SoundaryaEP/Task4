import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private static WebDriver driver;

    private BrowserFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
                // Replace this withLas default browser you want to use in your tests
                //System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chrome-win64\\chrome.exe");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            return driver;
    }
    public static void destroyDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }

}
