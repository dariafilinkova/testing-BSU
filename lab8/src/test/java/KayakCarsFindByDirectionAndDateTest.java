import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.KayakCarsPage;
import page.ResultPage;


public class KayakCarsFindByDirectionAndDateTest {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void citySearchTest() throws InterruptedException {
        KayakCarsPage page = new KayakCarsPage(driver);
        page.openPage();
        Thread.sleep(2000);
        page.openListOfDirection(); //Instead of direction place
        Thread.sleep(2000);
        page.inputDirection("Lisbon, Portugal");
        page.clickOnCountryAndCity();
        page.clickOnSearchButton();

        ResultPage resultPage = new ResultPage(driver);
        resultPage.openResultPage();

       Assert.assertEquals(page.getCurrentUrl(), resultPage.getCurrentUrl());

    }


}
