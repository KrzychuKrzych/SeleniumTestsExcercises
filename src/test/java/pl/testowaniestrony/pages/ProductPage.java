package pl.testowaniestrony.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(name = "add-to-cart")
    private WebElement addToCardButton;

    @FindBy(xpath = "//div[@class='woocommerce-message']//a[text()='View cart']")
    private WebElement viewCardButton;

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage addProductToCard() {
        addToCardButton.click();
        return this;
    }

    public CardPage viewCard() {
        viewCardButton.click();
        return new CardPage(driver);
    }
}
