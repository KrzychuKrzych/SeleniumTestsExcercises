package pl.testowaniestrony.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggerUserPage {

    @FindBy(linkText = "Dashboard")
    private WebElement dashboardLink;

    private WebDriver driver;

    public LoggerUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getDashboardLink() {
        return dashboardLink;
    }
}
