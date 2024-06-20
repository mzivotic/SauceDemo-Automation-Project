package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer {

    public WebDriver driver;
    public WebDriverWait wait;

    WebElement twitterIcon;
    WebElement facebookIcon;
    WebElement linkedInIcon;
    String twitterURL = "https://x.com/saucelabs";
    String facebookURL = "https://www.facebook.com/saucelabs";
    String linkedInURL = "https://www.linkedin.com/company/sauce-labs/";

    public Footer(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }
    public WebElement getTwitterIcon(){
        return driver.findElement(By.linkText("Twitter"));
    }
    public WebElement getFacebookIcon(){
        return driver.findElement(By.linkText("Facebook"));
    }
    public WebElement getLinkedInIcon(){
        return driver.findElement(By.linkText("LinkedIn"));
    }
    public String getTwitterURL() {
        return twitterURL;
    }
    public String getFacebookURL() {
        return facebookURL;
    }
    public String getLinkedInURL() {
        return linkedInURL;
    }

    //--------------------------------------------------------------------

    // Ovde je koriscen JavaScript za otvaranje aplikacije u istom prozoru zbog nemogucnosti da se uradi
    // assert URL-a jer aplikacije se otvaraju u novom tabu, a selenium ostaje na main window

    public void twitterIconClick(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('target', '_self');", getTwitterIcon());
        getTwitterIcon().click();
    }
    public void facebookIconClick(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('target', '_self');", getFacebookIcon());
        getFacebookIcon().click();
    }
    public void linkedInIconClick(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('target', '_self');", getLinkedInIcon());
        getLinkedInIcon().click();

    }
}
