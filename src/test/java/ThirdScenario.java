import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AnimationPage;

import java.util.logging.Logger;

import static org.testng.Assert.assertTrue;

public class ThirdScenario extends BasicTest {

    private AnimationPage AnimationPage = PageFactory.initElements(getWebDriver(), AnimationPage.class);
    private static final Logger logger = Logger.getLogger(FirstScenario.class.getName());

    @Test
    public void chooseFantasyTest() {
        logger.info("Starting Scenario 3 ");
        AnimationPage.open();
        AnimationPage.chooseFantasy();
        assertTrue(AnimationPage.fantasyIsTrue());
        logger.info("Finishing Scenario 3\n");
    }
}
