import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public LoginPage loginpage;
    public ProductsPage productsPage;
    public CartPage cartPage;
    public CheckOutPage checkOutPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginpage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
