package testHomePage;

import common.WebAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void beforeMethod(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void validateSearchBox() throws InterruptedException {

        homePage.verifySearchBox();

    }
}
