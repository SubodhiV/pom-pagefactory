package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginPage;


public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    LandingPage landingPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 0)
    public void testLogin() {
        loginPage = new LoginPage(driver);
        loginPage.login("student", "Password123");

        landingPage = new LandingPage(driver);
        //Login to the application.
        String loggedInText = landingPage.getLoggedInText();

        //Verify the Logged-in text in landing page.
        Assert.assertEquals(loggedInText, "Logged In Successfully", "Logged In Text was not found!!!");
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
