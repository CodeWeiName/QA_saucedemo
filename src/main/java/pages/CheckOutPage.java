package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    By title = By.className("subheader");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.xpath("//input[@class = 'btn_primary cart_button']");
    By finishButton = By.xpath("//a [@class = 'btn_action cart_button']");
    By overviewTitle = By.xpath("//div [text() = 'Checkout: Overview']");
    By finishTitle = By.className("complete-header");

    public boolean isPageCheckOutOppened() {
        return driver.findElement(title).isDisplayed();
    }

    public void yourInformatioun(String firstname, String lastname, String code) {
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(postalCode).sendKeys(code);
        driver.findElement(continueButton).click();
    }

    public boolean isPageOverview() {
        return driver.findElement(overviewTitle).isDisplayed();
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();
    }

    public boolean isFinishPage() {
        return driver.findElement(finishTitle).isDisplayed();
    }

}
