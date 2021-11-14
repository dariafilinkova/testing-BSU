package page;

import org.openqa.selenium.WebDriver;

public class ResultPage {
    private WebDriver driver;
    private static final String RESULT_PAGE = "https://www.kayak.com/cars/Lisbon,Portugal-c2172/2021-11-21/2021-11-28;map?sort=rank_a";

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public ResultPage openResultPage() {
        driver.get(RESULT_PAGE);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
