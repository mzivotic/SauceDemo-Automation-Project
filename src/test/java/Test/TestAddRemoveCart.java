package Test;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddRemoveCart extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginToPage();
    }

    @Test (priority = 10) // Testiramo mogucnost ubacivanje odredjenog artikla u korpu
    public void addToCart(){
        addRemoveCart.addToCartBackpackClick();

        // Asertujemo da li se u korpi pojavio broj 1 i da li je vidljiv "Remove button"
        Assert.assertEquals(addRemoveCart.getCartText(), "1");
        Assert.assertTrue(addRemoveCart.getRemoveFromCartBackpack().isDisplayed());

    }
    @Test (priority = 20) // Testiramo mogucnost uklanjanja odredjenog artikla iz korpe
    void removeFromCart(){
        addRemoveCart.removeFromCartBackpackClick();

        // Asertujemo da li je nakon brisanja artikla vidljiv "Add to cart"
        Assert.assertTrue(addRemoveCart.getAddToCartBackpack().isDisplayed());


    }
}



