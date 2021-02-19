import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.logging.Logger;

import static org.testng.Assert.assertTrue;

public class FirstScenario extends BasicTest {

    private HomePage homePage = PageFactory.initElements(getWebDriver(), HomePage.class);
    private static final Logger logger = Logger.getLogger(FirstScenario.class.getName());

    @Test
    public void chooseComedyTest() {
        logger.info("Starting Scenario 1 ");
        homePage.open();
        homePage.ChooseComedy();
        assertTrue(homePage.comedyIsTrue());
        logger.info("Finishing Scenario 1\n");
    }
}
