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

    @FindBy(css = "#tab-films > div.b-params-filter.m-25p > div > div > div:nth-child(1) > div > div > button")
    private WebElement buttonFilms;

    @FindBy(css = "#tab-films > div.b-params-filter.m-25p > div > div > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > a > span")
    private WebElement buttonComedy;

    @FindBy()

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ChooseComedy() {
        linkAfisha.click();
        linkOnline.click();
        buttonFilms.click();
        buttonComedy.click();

    }


    @Override
    public void open() {
        driver.get(ConfigProperties.getProperties("home.url"));
    }

}
