
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CinemaPage;
import java.util.logging.Logger;

import static org.testng.Assert.assertTrue;

public class SecondScenario extends BasicTest {

    private CinemaPage CinemaPage = PageFactory.initElements(getWebDriver(), pages.CinemaPage.class);
    private static final Logger logger = Logger.getLogger(FirstScenario.class.getName());

    @Test
    public void ChooseDetectiveTest() {
        logger.info("Starting scenario 2");
        CinemaPage.open();
        CinemaPage.ChooseDetective();
        assertTrue(CinemaPage.isTrueDetective());
        logger.info("Finishing scenario 2");
    }

}
