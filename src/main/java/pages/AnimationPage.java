package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;

public class AnimationPage  extends Page {

    @FindBy(xpath = "//button[@title='Жанры']")
    private WebElement buttonGenre;

    @FindBy(xpath = "//li[@rel='3']")
    private WebElement chooseFantasy;

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
        chooseFantasy.click();
    }

    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("ANIMATION_URL"));
    }
}
