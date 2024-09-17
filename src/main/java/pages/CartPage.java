package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By clickCheckout = By.xpath("//a [@class = 'btn_action checkout_button']");
    By openPage = By.id("shopping_cart_container");
    String removeCartButton = "//div [text() = '%s']/ancestor::div[@class = 'cart_list']//button[text() = 'REMOVE']";

    public boolean cartPageOpened() {
        return driver.findElement(openPage).isDisplayed();
    }

    public void removeCart(String product) {
        driver.findElement(By.xpath(String.format(removeCartButton, product))).click();
    }

    public void ClickCheckoutButton() {
        driver.findElement(clickCheckout).click();
    }
}

// //div [text() = 'Sauce Labs Backpack']/ancestor::div[@class = 'cart_list']//button[text() = 'REMOVE']