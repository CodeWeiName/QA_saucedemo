import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckOutTest extends BaseTest {

    @Test(testName = "Полное тестирование функционала")
    public void AllCheckWorking() {
        loginpage.open();
        loginpage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.addToCart("Sauce Labs Fleece Jacket");
        productsPage.clickCart();
        assertTrue(cartPage.cartPageOpened());
        cartPage.removeCart("Sauce Labs Fleece Jacket");
        cartPage.ClickCheckoutButton();
        assertTrue(checkOutPage.isPageCheckOutOppened());
        checkOutPage.yourInformatioun("Jon", "Doe", "94043");
        assertTrue(checkOutPage.isPageOverview());
        checkOutPage.clickFinish();
        assertTrue(checkOutPage.isFinishPage());

    }

}
