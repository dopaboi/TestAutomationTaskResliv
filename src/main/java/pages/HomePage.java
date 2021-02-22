package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;

import java.util.List;

public class HomePage extends Page {


    @FindBy(linkText = "Афиша")
    private WebElement linkAfisha;

    @FindBy(linkText = "Онлайн-кинотеатры")
    private WebElement linkOnline;

    @FindBy(css = "#tab-films .selectpicker[title='Жанры']")
    private WebElement buttonFilms;

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
        List<WebElement> genres = driver.findElements
                (By.cssSelector(".tab-content.active .dropdown-menu.inner.selectpicker li"));
        for (WebElement genre : genres) {
            if (genre.findElement(By.className("text")).getText().equals("Комедия")) {
                genre.click();
                break;
            }
        }
    }


    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("HOME_URL"));
    }

}
