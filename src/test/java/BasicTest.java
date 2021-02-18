import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperties("imp.wait")), TimeUnit.SECONDS);
        }
        return driver;
    }



    @AfterTest
    public void tearDown()  {
        driver.quit();
    }
}
