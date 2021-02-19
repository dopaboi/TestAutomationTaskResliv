package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;

import java.util.List;


public class CinemaPage extends Page {
    public CinemaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Сериалы")
    private WebElement linkSerials;

    @FindBy(xpath = "(//button[@type='button' and @title='Жанры'])[2]")
    private WebElement buttonFilms;

    @FindBy(xpath = "(//li[@rel='0'])[2]")
    private WebElement buttonDetective;

    @FindBy(xpath = "//div[@class='txt' and p[contains(text(),'Детектив')]]")
    private WebElement comedy;


    public void ChooseDetective() {
        linkSerials.click();
        buttonFilms.click();
        buttonDetective.click();
    }

    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("ONLINE_CINEMA_URL"));
    }
}
