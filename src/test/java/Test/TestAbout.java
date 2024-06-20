package Test;

import Base.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAbout extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginToPage();

    }

    @Test (priority = 10) // Testiramo otvaranje About linka u sklopu "Burger menu-a"
    public void aboutLink() throws InterruptedException {
        loginLogout.burgerMenuClick();
        wait.until(ExpectedConditions.elementToBeClickable(about.getAboutLink())).click();
        wait.until(ExpectedConditions.elementToBeClickable(about.getSearch())).click();

        // Asertujemo da li se pojavljuju SignIn link i Search bar kao i da li smo na pravoj stranici
        Assert.assertTrue(about.getSignInLink().isDisplayed());
        Assert.assertTrue(about.getSearchBar().isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), about.getExpectedURL());

    }
    @Test (priority = 20)
    public void pricingLink() throws InterruptedException {

        loginLogout.burgerMenuClick();
        wait.until(ExpectedConditions.elementToBeClickable(about.getAboutLink())).click();
        about.pricingClick();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), about.getExpectedPricingURL());

    }
    @Test (priority = 30)
    public void requestDemoLink() throws InterruptedException {
        loginLogout.burgerMenuClick();
        wait.until(ExpectedConditions.elementToBeClickable(about.getAboutLink())).click();
        about.requestDemoClick();
        Thread.sleep(3000);

        Assert.assertTrue(about.getEmail().isDisplayed());
        Assert.assertTrue(about.getCompany().isDisplayed());
        Assert.assertTrue(about.getInterest().isDisplayed());
        Assert.assertTrue(about.getComments().isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), about.getExpectedRequestDemoURL());

    }
    @Test (priority = 40)
    public void searchFunction() throws InterruptedException {

        loginLogout.burgerMenuClick();
        wait.until(ExpectedConditions.elementToBeClickable(about.getAboutLink())).click();
        wait.until(ExpectedConditions.elementToBeClickable(about.getSearch())).click();
        String text = "Blog";
        about.getSearchBar().sendKeys(text);
        about.getSearchBar().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        about.blogLinkClick();
        Thread.sleep(2000);
        about.filterClick();
        Thread.sleep(2000);
        about.bankingLinkClick();
        about.applyFilterClick();
        Thread.sleep(2000);
        about.closeButtonClick();

        Assert.assertEquals(driver.getCurrentUrl(), about.getExpectedBankingURL());

    }
    @Test (priority = 50) // Testiramo odlazak na About link i preko Mouseover-a selektujemo zeljeni drugi link
    public void seleniumLinkPage() throws InterruptedException {
        loginLogout.burgerMenuClick();
        Thread.sleep(2000);
        about.aboutLinkClick();
        about.mouseOverSolutionsLink();
        about.visualTestingLinkClick();
        Thread.sleep(2000);

        // Asertujemo da li se odredjeni tekst nalazi na stranici nakon sto smo ga definisali u page klasi
        String pageText = driver.getPageSource();
        Assert.assertTrue(pageText.contains(about.getExpectedText()));
    }
}
