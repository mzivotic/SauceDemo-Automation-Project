package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckout extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginToPage();
        addRemoveCart.addToCartBackpackClick();
    }

    @Test // Testiramo Checkout dugme i asertujemo da li se prikazuju odredjena polja nakon toga
    public void checkout(){
        checkout.getCartContainer().click();
        checkout.getCheckoutButton().click();

        Assert.assertTrue(checkout.getFirstNameField().isDisplayed());
        Assert.assertTrue(checkout.getLastNameField().isDisplayed());
        Assert.assertTrue(checkout.getPostalCode().isDisplayed());
        Assert.assertTrue(checkout.getContinueButton().isDisplayed());

    }
}
