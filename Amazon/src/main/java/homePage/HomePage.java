package homePage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.time.Duration;

public class HomePage extends WebAPI {

    @FindBy (xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchBox;

    public void verifySearchBox() throws InterruptedException {

        searchBox.sendKeys("Mac Laptop");
        Thread.sleep(5000);
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(5)).build().perform();


    }

}
