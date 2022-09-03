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

}
