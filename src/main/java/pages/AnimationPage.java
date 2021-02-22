package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;
import java.util.List;

public class AnimationPage  extends Page {

    @FindBy(css = "#tab-cartoons .selectpicker[title='Жанры']")
    private WebElement buttonGenre;

    @FindBy(xpath = "//div[@class='txt' and p[contains(text(),'Фэнтези, Фантастика, Приключения, Детский/Семейный, Анимация, 2017')]]")
    private WebElement fantasy;

    public boolean fantasyIsTrue(){
        return isElementPresent(fantasy);
    }

    public AnimationPage(WebDriver driver) {
        super(driver);
    }

    public void chooseFantasy()
    {
        buttonGenre.click();
        List<WebElement> genres = driver.findElements
                (By.cssSelector(".tab-content.active .dropdown-menu.inner.selectpicker li"));
        for (WebElement genre : genres) {
            if (genre.findElement(By.className("text")).getText().equals("Фэнтези")) {
                genre.click();
                break;
            }
        }
    }

    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("ANIMATION_URL"));
    }
}
