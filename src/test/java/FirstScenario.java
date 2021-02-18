import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class FirstScenario extends BasicTest {

    private HomePage homePage = PageFactory.initElements(getWebDriver(), HomePage.class);

    @Test
    public void chooseComedyTest() {
        homePage.open();
        homePage.ChooseComedy();
    }
}
