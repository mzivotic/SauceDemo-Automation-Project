package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public LoginLogout loginLogout;
    public AddRemoveCart addRemoveCart;
    public Checkout checkout;
    public About about;
    public Footer footer;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginLogout = new LoginLogout(driver,wait);
        addRemoveCart = new AddRemoveCart(driver,wait);
        checkout = new Checkout(driver,wait);
        about = new About(driver,wait);
        footer = new Footer(driver,wait);

    }
    public void loginToPage(){ // Metoda za login koju koristimo u test klasama
        loginLogout.usernameFieldClear();
        loginLogout.passwordFieldClear();
        loginLogout.getUsernameField().sendKeys(loginLogout.getUsername());
        loginLogout.getPasswordField().sendKeys(loginLogout.getPassword());
        loginLogout.loginButtonClick();
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }
}
