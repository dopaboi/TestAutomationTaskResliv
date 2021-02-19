import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


import utils.ConfigProperties;


public class BasicTest {

    protected static WebDriver driver;


    protected WebDriver getWebDriver() {

        if (driver == null) {
            //System.setProperty(ConfigProperties.getProperties("name.driver"), ConfigProperties.getProperties("path.driver"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperties("IMPLICIT_WAIT")), TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(Long.parseLong(ConfigProperties.getProperties("PAGE_LOAD")), TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(Long.parseLong(ConfigProperties.getProperties("SCRIPT_LOAD")), TimeUnit.SECONDS);
        }
        return driver;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
