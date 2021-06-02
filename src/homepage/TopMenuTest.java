package homepage;

import browsertesting.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseClass {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {

        Thread.sleep(3000);
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Shipping']"));
        verifyExpectedText(By.xpath("//h1[@id='page-title']"), "Shipping");
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {

        Thread.sleep(3000);
        clickOnElement(By.xpath("(//span[text()='New!'])[2]"));
        verifyExpectedText(By.xpath("//h1[@id='page-title']"), "New arrivals");
    }

    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() throws InterruptedException {

        Thread.sleep(3000);
        clickOnElement(By.xpath("(//span[text()='Coming soon'])[2]"));
        verifyExpectedText(By.xpath("//h1[@id='page-title']"), "Coming soon");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {

        Thread.sleep(3000);
        clickOnElement(By.xpath("(//span[text()='Contact us'])[2]"));
        verifyExpectedText(By.xpath("//h1[@id='page-title']"), "Contact us");
    }

    @After
    public void tearBrowser() {
        closeBrowser();
    }


}
