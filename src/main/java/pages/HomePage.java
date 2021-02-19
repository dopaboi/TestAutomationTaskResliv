package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigProperties;

public class HomePage extends Page {


    @FindBy(linkText = "Афиша")
    private WebElement linkAfisha;

    @FindBy(linkText = "Онлайн-кинотеатры")
    private WebElement linkOnline;

    @FindBy(xpath = "//button[@type='button' and @title='Жанры']")
    private WebElement buttonFilms;

    @FindBy(xpath = "//li[@rel='0']")
    private WebElement buttonComedy;

    @FindBy(xpath = "//div[@class='txt' and p[contains(text(),'Комедия, 2017')]]")
    private WebElement comedy;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean comedyIsTrue()
    {
        return isElementPresent(comedy);
    }

    public void ChooseComedy() {
        linkAfisha.click();
        linkOnline.click();
        buttonFilms.click();
        buttonComedy.click();
    }


    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("HOME_URL"));
    }

}
