package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KayakCarsPage {

    public static String Cars_PAGE_URL = "https://www.kayak.com/cars";
    private WebDriver driver;

    private By inputCarLocator = By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div/div[2]/div[1]/div[1]/div/div");
    private By inputDirection = By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[2]/div/input");
    private By inputCountryAndCity = By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/ul/li[2]/div");
    private By searchButton = By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div/div[2]/div[2]/button");


    private By inputDateFromLocator = By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/span[1]");


    public KayakCarsPage(WebDriver driver) {
        this.driver = driver;
    }

    public KayakCarsPage openPage() {
        driver.get(Cars_PAGE_URL);
        return this;
    }

    public WebElement findByLocator(By locator) {
        return new WebDriverWait(driver, 100)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public KayakCarsPage openListOfDirection() {
        findByLocator(inputCarLocator).click();
        return this;
    }

    public KayakCarsPage clickOnCountryAndCity() {
        findByLocator(inputCountryAndCity).click();
        return this;
    }

    public KayakCarsPage inputDirection(String inputDestination) {
        findByLocator(inputDirection).sendKeys(inputDestination);
        return this;
    }

    public KayakCarsPage openDateFrom() {
        findByLocator(inputDateFromLocator).click();
        return this;
    }

    public KayakCarsPage clickOnSearchButton() {
        findByLocator(searchButton).click();
        return this;
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
