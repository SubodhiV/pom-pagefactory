package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By txtUsername = By.id("username");
    By txtPassword = By.id("password");
    By btnSubmit = By.id("submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {//Set username in username text-box
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void setPassword(String password) {//Set password in password text-box
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickSubmit() { //Click on Submit button
        driver.findElement(btnSubmit).click();
    }

    public void login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickSubmit();
    }
}
