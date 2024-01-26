package Factory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class driverFactory {

    public static WebDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "DriverChrome/chromedriver_win.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
