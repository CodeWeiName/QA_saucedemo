import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest extends BaseTest {

    @Test(testName = "Проверка входа в магазин с позитивными кредами")
    public void checkLoginWithPositiveData() {
        loginpage.open();
        loginpage.login("standard_user", "secret_sauce");
        assertTrue(driver.findElement(By.className("product_label")).isDisplayed(),
                "Элемент не отображается на странице магазина");
    }

    @Test(testName = "Проверка входа в магазин с пустым полем логина")
    public void checkLoginWithEmptyUserNameField() {
        loginpage.open();
        loginpage.login("", "secret_sauce");
        assertEquals(loginpage.getErrorMessage(),
                "Epic sadface: Username is required",
                "Сообщение об ошибке не соответствует");
    }

    @Test(testName = "Проверка входа в магазин с пустым полем пароля")
    public void checkLoginWithEmptyPasswordField() {
        loginpage.open();
        loginpage.login("standard_user", "");
        assertEquals(loginpage.getErrorMessage(),
                "Epic sadface: Password is required",
                "Сообщение об ошибке не соответствует");
    }

    @Test(testName = "Проверка входа в магазин с пустым полем логина и пароля")
    public void checkLoginWithEptyUserNameAndPassworsField() {
        loginpage.open();
        loginpage.login("", "");
        assertEquals(loginpage.getErrorMessage(),
                "Epic sadface: Username is required",
                "Сообщение об ошибке не соответствует");
    }

    @Test(testName = "Проверка входа в магазин с некоректными данными")
    public void checkLoginWithNegativeData() {
        loginpage.open();
        loginpage.login("standard", "secret_sauc");
        assertEquals(loginpage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service",
                "Сообщение об ошибке не соответствует");
    }
}
