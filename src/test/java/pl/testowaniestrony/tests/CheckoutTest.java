package pl.testowaniestrony.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testowaniestrony.models.Customer;
import pl.testowaniestrony.pages.HomePage;
import pl.testowaniestrony.pages.OrderDetailsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCard()
                .viewCard()
                .openAddressDetails()
                .fillAddressDetails(customer,"Komentarz");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getHeaderTag().getText(), "Selenium Demo Page");
    }

}
