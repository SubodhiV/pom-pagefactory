package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "username")
    WebElement txtUsername;
    @FindBy(id = "password")
    WebElement txtPassword;
    @FindBy(id = "submit")
    WebElement btnSubmit;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);//This initElements method will create all WebElements
    }

    public void setUsername(String username) {//Set username in username text-box
        txtUsername.sendKeys(username);
    }

    public void setPassword(String password) {//Set password in password text-box
        txtPassword.sendKeys(password);
    }

    public void clickSubmit() { //Click on Submit button
        btnSubmit.click();
    }

    public void login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickSubmit();
    }
}
