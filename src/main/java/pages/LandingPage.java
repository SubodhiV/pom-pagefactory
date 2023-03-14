package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;
    By lblLoggedInText = By.xpath("//*[@class='post-title']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoggedInText() {
        return driver.findElement(lblLoggedInText).getText();
    }
}
