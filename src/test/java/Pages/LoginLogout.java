package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogout {

    public WebDriver driver;
    public WebDriverWait wait;

    WebElement usernameField;
    WebElement passwordField;
    WebElement loginButton;
    WebElement burgerMenu;
    WebElement logoutButton;
    WebElement cartContainer;
    WebElement loginError;
    String actualURLlogout = "https://www.saucedemo.com/";
    String actualURLlogin = "https://www.saucedemo.com/inventory.html";
    String username = "standard_user"; // Deklarisanje i inicijalizacija stringa username koji koristimo u metodi za login
    String password = "secret_sauce"; // Deklarisanje i inicijalizacija stringa password koji koristimo u metodi za login

    public LoginLogout(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public WebElement getUsernameField(){
        return driver.findElement(By.id("user-name"));
    }
    public WebElement getPasswordField(){
        return  driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton(){
        return  driver.findElement(By.id("login-button"));
    }
    public WebElement getBurgerMenu(){
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
    public WebElement getLogoutButton(){
        return driver.findElement(By.id("logout_sidebar_link"));
    }
    public WebElement getCartContainer(){
        return driver.findElement(By.id("shopping_cart_container"));
    }
    public WebElement getLoginError(){
        return driver.findElement(By.cssSelector("[data-test='error-button'"));
    }
    public String getActualURLlogout() {
        return actualURLlogout;
    }
    public String getActualURLlogin() {
        return actualURLlogin;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    //--------------------------------------------------------------------------------//

    public void usernameFieldClear(){
        getUsernameField().clear();
        }
    public void passwordFieldClear(){
        getPasswordField().clear();
    }
    public void loginButtonClick(){
        getLoginButton().click();
    }
    public void burgerMenuClick(){
        getBurgerMenu().click();
    }
    public void logoutButtonClick(){
        getLogoutButton().click();
    }


}
