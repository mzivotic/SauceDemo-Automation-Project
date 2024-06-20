package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

    public WebDriver driver;
    public WebDriverWait wait;

    WebElement checkoutButton;
    WebElement cartContainer;
    WebElement firstNameField;
    WebElement lastNameField;
    WebElement postalCode;
    WebElement continueButton;

    public Checkout(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }
    public WebElement getCartContainer(){
        return driver.findElement(By.id("shopping_cart_container"));
    }
    public WebElement getCheckoutButton(){
        return driver.findElement(By.id("checkout"));
    }
    public WebElement getFirstNameField() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getLastNameField() {
        return driver.findElement(By.id("last-name"));
    }
    public WebElement getPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }
    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    //-------------------------------------------------------------

    public void checkOutButtonClick(){
        getCheckoutButton().click();
    }
    public void cartContainerClick(){
        getCartContainer().click();
    }
}
