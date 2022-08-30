package pl.testowaniestrony.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testowaniestrony.pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .loginValidData("test3@test.pl", "Testtest12!")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void logInWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .loginInvalidData("test@test.pl", "tes")
                .getError();
        Assert.assertTrue(error.getText().contains("Too many failed login attempts"), "Expected error text doesn't match");
    }
}
