package pl.testowaniestrony.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage {

    @FindBy(xpath = "//div[@class='woocommerce-order']//p")
    private WebElement orderNotice;

    @FindBy(xpath = "//span[@class='header-tagline ']")
    private WebElement headerTag;

    public OrderDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getOrderNotice() {
        return orderNotice;
    }

    public WebElement getHeaderTag() {
        return headerTag;
    }
}
