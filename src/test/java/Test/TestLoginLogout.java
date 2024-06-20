package Test;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginLogout extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test (priority = 10)
    public void login(){
        loginToPage();

        Assert.assertEquals(driver.getCurrentUrl(),loginLogout.getActualURLlogin());
        Assert.assertTrue(loginLogout.getCartContainer().isDisplayed());
    }
    @Test (priority = 20)
    public void logout(){

        loginToPage();
        loginLogout.burgerMenuClick();
        wait.until(ExpectedConditions.elementToBeClickable(loginLogout.getLogoutButton())).click();

        Assert.assertEquals(driver.getCurrentUrl(), loginLogout.getActualURLlogout());
        Assert.assertTrue(loginLogout.getLoginButton().isDisplayed());
    }
    @Test (priority = 30)
    public void loginNoPassword(){

        loginLogout.usernameFieldClear();
        loginLogout.getUsernameField().sendKeys(loginLogout.getUsername());
        loginLogout.loginButtonClick();

        Assert.assertTrue(loginLogout.getLoginError().isDisplayed());



    }
}
