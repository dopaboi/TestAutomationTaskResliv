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

    @FindBy(css = "#tab-tv-series .selectpicker[title='Жанры']")
    private WebElement buttonFilms;

    @FindBy(xpath = "//div[@class='txt' and p[contains(text(),'Триллер, Детектив, 2014')]]")
    private WebElement detective;

    public boolean isTrueDetective() {
        return isElementPresent(detective);
    }

    public void ChooseDetective() {
        linkSerials.click();
        buttonFilms.click();
        List<WebElement> genres = driver.findElements
                (By.cssSelector(".tab-content.active .dropdown-menu.inner.selectpicker li"));
        for (WebElement genre : genres) {
            if (genre.findElement(By.className("text")).getText().equals("Детектив")) {
                genre.click();
                break;
            }
        }
    }

    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("ONLINE_CINEMA_URL"));
    }
}
