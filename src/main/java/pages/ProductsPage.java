package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By title = By.className("product_label");
    By cartButton = By.id("shopping_cart_container");
    String addToCartButton = "//div [text() = '%s']/ancestor::div[@class ='inventory_item']//button[text() = 'ADD TO CART']";
    String itemName = "//div [text() = '%s']";
    String itemDesk = "//div [text() = '%s']";


    public boolean isPageOpened() {
        return driver.findElement(title).isDisplayed();
    }

    public void addToCart(String product) {
        driver.findElement(By.xpath(String.format(addToCartButton, product))).click();
    }

    public void clickCart() {
        driver.findElement(cartButton).click();
    }
}


////div [text() = 'Sauce Labs Backpack']/ancestor::div[@class ='inventory_item']//button[text() = 'ADD TO CART']