package Test;

import Base.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFooter extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginToPage();

    }
    @Test (priority = 10) // Testiramo odlazak na Twitter stranicu sa kasnijim vracanjem na home page kako bismo nastavili dalje testiranje
    public void twitterTest(){
        footer.twitterIconClick();
        wait.until(ExpectedConditions.urlContains(footer.getTwitterURL()));

        Assert.assertEquals(driver.getCurrentUrl(), footer.getTwitterURL());
        driver.navigate().back();

    }
    @Test (priority = 20) // Testiramo odlazak na Facebook stranicu sa kasnijim vracanjem na home page kako bismo nastavili dalje testiranje
    public void facebookTest(){
        footer.facebookIconClick();
        wait.until(ExpectedConditions.urlContains(footer.getFacebookURL()));

        Assert.assertEquals(driver.getCurrentUrl(), footer.getFacebookURL());
        driver.navigate().back();

    }
    @Test (priority = 30) // Testiramo odlazak na LinkedIn stranicu i time zavrsavamo ceo test
    public void linkedInTest(){
        footer.linkedInIconClick();
        wait.until(ExpectedConditions.urlContains(footer.getLinkedInURL()));

        Assert.assertEquals(driver.getCurrentUrl(), footer.getLinkedInURL());
    }


}