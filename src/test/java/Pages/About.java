package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class About {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;

    WebElement aboutLink;
    WebElement search;
    WebElement pricing;
    WebElement requestDemo;
    WebElement searchBar;
    WebElement blogLink;
    WebElement filterLink;
    WebElement bankingLink;
    WebElement applyFilter;
    WebElement closeButton;
    WebElement solutionsLink;
    WebElement visualTestingLink;
    WebElement email;
    WebElement company;
    WebElement interest;
    WebElement comments;
    WebElement signInLink;
    String expectedRequestDemoURL = "https://saucelabs.com/request-demo";
    String expectedText = "UI/VISUAL TESTING"; // Text koji pozivamo u testu da proverimo da li smo na pravoj stranici
    String expectedBankingURL = "https://saucelabs.com/resources/blog?industries=banking";
    String ExpectedPricingURL = "https://saucelabs.com/pricing";
    String ExpectedURL = "https://saucelabs.com/";

    public About(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
        this.actions=new Actions(driver);
    }
    public WebElement getAboutLink(){
        return driver.findElement(By.id("about_sidebar_link"));
    }
    public WebElement getSignInLink() {
        return driver.findElement(By.linkText("Sign in"));
    }
    public WebElement getSearch(){
        return driver.findElement(By.cssSelector("img[alt='search']"));
    }
    public WebElement getPricing(){
        return driver.findElement(By.linkText("Pricing"));
    }
    public WebElement getRequestDemo(){
        return driver.findElement(By.linkText("Request a demo"));
    }
    public WebElement getSearchBar(){
        return driver.findElement(By.id("search"));
    }
    public WebElement getBlogLink(){
        return driver.findElement(By.cssSelector(".MuiStack-root.css-1cf4ch4"));
    }
    public WebElement getFilterLink(){
        return driver.findElement(By.cssSelector(".MuiStack-root.css-1c6a4v6"));
    }
    public WebElement getBankingLink(){
        return driver.findElement(By.cssSelector(".MuiStack-root.css-11kubsk > .MuiStack-root.css-1jxqyf3:nth-child(2)"));
    }
    public WebElement getApplyFilter(){
        return driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[2]/button[1]"));
    }
    public WebElement getCloseButton(){
        return driver.findElement(By.xpath("/html/body/div[10]/div[3]/button"));
    }
    public WebElement getSolutionsLink(){
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[2]/div[1]/div[1]/span"));
    }
    public WebElement getVisualTestingLink(){
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[10]/a/div/div/div/div[2]/span"));
    }
    public String getExpectedText() {
        return expectedText;
    }
    public WebElement getEmail() {
        return driver.findElement(By.id("Email"));
    }
    public WebElement getCompany() {
        return driver.findElement(By.id("Company"));
    }
    public WebElement getInterest() {
        return driver.findElement(By.id("Solution_Interest__c"));
    }
    public WebElement getComments() {
        return driver.findElement(By.id("Sales_Contact_Comments__c"));
    }
    public String getExpectedRequestDemoURL() {
        return expectedRequestDemoURL;
    }
    public String getExpectedBankingURL() {
        return expectedBankingURL;
    }
    public String getExpectedPricingURL() {
        return ExpectedPricingURL;
    }
    public String getExpectedURL() {
        return ExpectedURL;
    }

    //------------------------------------------------------------------------


    public void aboutLinkClick(){
        getAboutLink().click();
    }
    public void searchClick(){
        getSearch().click();
    }
    public void pricingClick(){
        getPricing().click();
    }
    public void requestDemoClick(){
        getRequestDemo().click();
    }
    public void useSearchBar(){
        getSearchBar();
    }
    public void blogLinkClick(){
        getBlogLink().click();
    }
    public void filterClick(){
        getFilterLink().click();
    }
    public void bankingLinkClick(){
        getBankingLink().click();
    }
    public void applyFilterClick(){
        getApplyFilter().click();
    }
    public void closeButtonClick(){
        getCloseButton().click();
    }
    public void mouseOverSolutionsLink(){ // Metoda za mouseover preko odredjenog linka
        actions.moveToElement(getSolutionsLink()).perform();
    }
    public void visualTestingLinkClick(){
        getVisualTestingLink().click();
    }

}
