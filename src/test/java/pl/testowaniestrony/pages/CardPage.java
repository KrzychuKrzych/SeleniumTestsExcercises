package pl.testowaniestrony.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPage {

    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    private WebElement proccedToCheckoutButton;

    private WebDriver driver;
    public CardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public AddressDetailsPage openAddressDetails() {
        proccedToCheckoutButton.click();
        return new AddressDetailsPage(driver);
    }
}
