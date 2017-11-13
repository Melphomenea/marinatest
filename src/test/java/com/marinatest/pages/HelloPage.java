package com.marinatest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloPage extends BasePage<HelloPage> {

    public HelloPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isCorrectPage() {
        return driver.getTitle().equalsIgnoreCase("UI Testing Site"); }


    @Override
    protected HelloPage getThis() {
        return this;
    }

    @FindBy (xpath = "//h1")
    private WebElement h1;

    public void isResultDisplayed(String formResult) {
        Assert.assertEquals(h1.getText(), formResult);

    }
}
