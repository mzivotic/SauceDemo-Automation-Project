package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRemoveCart {

    public WebDriver driver;
    public WebDriverWait wait;

    WebElement addToCartBackpack;
    WebElement removeFromCartBackpack;
    WebElement cartBadge;



    public AddRemoveCart(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public WebElement getAddToCartBackpack(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public WebElement getRemoveFromCartBackpack(){
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }
    public WebElement getCartBadge(){
        return driver.findElement(By.className("shopping_cart_badge"));
    }
    public String getCartText() {  // Metoda nam sluzi za proveru da li se odredjeni broj vidi u korpi
        WebElement cartBadge = getCartBadge();
        return cartBadge.getText();
    }

//-----------------------------------------------------------------------------------------


    public void addToCartBackpackClick(){
        getAddToCartBackpack().click();
    }
    public void removeFromCartBackpackClick(){
        getRemoveFromCartBackpack().click();
    }
    }
