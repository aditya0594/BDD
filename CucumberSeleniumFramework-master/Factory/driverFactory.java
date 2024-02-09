package Factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class driverFactory {

    public static WebDriver driver;
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "DriverChrome/chromedriver_win.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
